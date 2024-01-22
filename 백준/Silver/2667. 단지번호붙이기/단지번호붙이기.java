import java.io.*;
import java.util.*;

public class Main {
    private static int n;
    private static int total;
    private static int[][] map;
    private static boolean[][] visited;
    private final static List<Integer> result = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init(br);
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == 1 && !visited[i][j]) BFS(i, j);
            }
        }
        
        System.out.println(total);
        result.stream().sorted().forEach(System.out::println);
    }
    
    public static void init(BufferedReader br) throws IOException {
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            String[] read = br.readLine().split("");
            for (int j = 0; j < read.length; j++) map[i][j] = Integer.parseInt(read[j]);
        }
    }
    
    private static void BFS(int x, int y) {
        final int[] dx = {1, 0, 0, -1};
        final int[] dy = {0, 1, -1, 0};
        int sum = 1;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            x = node[0];
            y = node[1];
            
            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n || visited[nextX][nextY]) continue;
                
                visited[nextX][nextY] = true;
                if (map[nextX][nextY] == 0) continue;
                
                queue.add(new int[]{nextX, nextY});
                sum++;
            }
        }
        total++;
        result.add(sum);
    }
}