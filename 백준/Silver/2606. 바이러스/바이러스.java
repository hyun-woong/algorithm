import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int totalComputer;
    static int conntionComputer;
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init(br);
        
        if (totalComputer == 1) {
            System.out.println(0);
            return;
        }
        
        for(int i = 0; i < conntionComputer; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
           
        }
        int bfs = BFS(1);
        System.out.println(bfs);
    }
    
    private static void init(BufferedReader br) throws IOException {
        totalComputer = Integer.parseInt(br.readLine());
        conntionComputer = Integer.parseInt(br.readLine());
        
        int arrSize = totalComputer + 1;
        arr = new int[arrSize][arrSize];
        visited = new boolean[arrSize];
    }
    
    private static int BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        int result = 0;
        
        queue.add(start);
        visited[start] = true;
        
        while(!queue.isEmpty()) {
            int node = queue.poll();
            result++;
            
            for(int i = 1; i < totalComputer +1; i++) {
                if(arr[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return result -1;
    }
}