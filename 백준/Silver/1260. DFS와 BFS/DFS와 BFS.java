import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int node;
    private static int line;
    private static int startNode;

    private static int[][] arr;
    private static boolean[] visited;
    private static Queue<Integer> Q = new LinkedList<>();

    private static final StringBuffer dfsStr = new StringBuffer();
    private static final StringBuffer bfsStr = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init(br);

        for (int i = 0; i < line; i++) {
            StringTokenizer strToken = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(strToken.nextToken());
            int y = Integer.parseInt(strToken.nextToken());

            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        dfs(startNode);
        System.out.println(dfsStr.toString().trim());

        initVisited();
        bfs(startNode);
        System.out.println(bfsStr.toString().trim());
    }

    /** 멤버 변수 초기화 */
    private static void init(BufferedReader br) throws IOException {
        StringTokenizer token = new StringTokenizer(br.readLine());

        node = Integer.parseInt(token.nextToken());
        line = Integer.parseInt(token.nextToken());
        startNode = Integer.parseInt(token.nextToken());

        arr = new int[node + 1][node + 1];
        initVisited();
    }

    private static void initVisited() {
        visited = new boolean[node + 1];
    }

    /** 깊이 우선 탐색 */
    private static void dfs(int start) {
        visited[start] = true;
        dfsStr.append(start).append(" ");

        for (int i = 0; i <= node; i++) {
            if (arr[start][i] == 1 && !visited[i]) dfs(i);
        }
    }

    /** 너비 우선 탐색 */
    private static void bfs(int start) {
        Q.add(start);
        visited[start] = true;

        while (!Q.isEmpty()) {
            start = Q.poll();
            bfsStr.append(start).append(" ");

            for (int i = 1; i <= node; i++) {
                if (arr[start][i] == 1 && !visited[i]) {
                    Q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
