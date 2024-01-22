import java.io.*;
import java.util.*;


public class Main {
    private static int[][] arr;
    private static boolean[][] visited;
    private static int n;
    private static int m;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init(br);
        BFS(0, 0);
        
        System.out.println(arr[n-1][m-1]);
    }
    
    private static void init(BufferedReader br) throws IOException {
        StringTokenizer token = new StringTokenizer(br.readLine());
        n = Integer.parseInt(token.nextToken());
        m = Integer.parseInt(token.nextToken());
        
        arr = new int[n][m];
        visited = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            String[] read = br.readLine().split("");
            for (int j = 0; j < read.length; j++) arr[i][j] = Integer.parseInt(read[j]);
        }
    }
    
    private static void BFS(int x, int y) {
        final int[] dx = {0, 1, 0, -1};
        final int[] dy = {-1, 0, 1, 0};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            x = poll[0];
            y = poll[1];
            
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                
                if (newX < 0 || newY < 0 || newX >= n || newY >= m || visited[newX][newY] || arr[newX][newY] == 0) continue;
                visited[newX][newY] = true;
                arr[newX][newY] = arr[x][y] +1;
                queue.add(new int[]{newX, newY});
            }
        }
    }
}