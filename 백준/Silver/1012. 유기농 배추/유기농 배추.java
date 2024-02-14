import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static final int[] dx = new int[]{-1, 0, 0, 1};
    static final int[] dy = new int[]{0, -1, 1, 0};
    static int[][] map;
    static boolean[][] visited;
    static int result;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());
            init(x, y);
            setupMap(br, Integer.parseInt(token.nextToken()));

            for (int k = 0; k <= x; k++) {
                for (int j = 0; j <= y; j++) {
                    if (map[k][j] == 1 && !visited[k][j]) {
                        bfs(k, j);
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }

    private static void init(int x, int y) {
        result = 0;
        map = new int[x+1][y+1];
        visited = new boolean[x+1][y+1];
    }

    private static void setupMap(BufferedReader br, int existCount) throws IOException {
        for (int j = 0; j < existCount; j++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int cx = Integer.parseInt(token.nextToken());
            int cy = Integer.parseInt(token.nextToken());
            map[cx][cy] = 1;
        }
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            x = node[0];
            y = node[1];

            visited[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX < 0 || newY < 0 || visited[newX][newY] || map[newX][newY] != 1) continue;
                visited[newX][newY] = true;
                queue.add(new int[]{newX, newY});
            }
        }
    }
}
