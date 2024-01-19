import java.io.*;
import java.util.*;

public class Main {
    private static int line;
    private static int[] parents;
    private static boolean[] visited;
    private static final List<List<Integer>> list = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        line = Integer.parseInt(br.readLine());
        
        init();
        setArr(br);
        BFS();
        
        for (int i = 2; i < parents.length; i++) System.out.println(parents[i]);
    }
    
    public static void init() {
        int size = line +1;
        visited = new boolean[size];
        parents = new int[size];
        
        for (int i = 0; i < size; i++) list.add(new ArrayList<>());
    }
    
    public static void setArr(BufferedReader br) throws IOException {
        for (int i = 0; i < line -1; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());
            
            list.get(x).add(y);
            list.get(y).add(x);
        }
    }
    
    public static void BFS() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        
        while(!queue.isEmpty()) {
            int node = queue.poll();
            
            for (int i : list.get(node)) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    parents[i] = node;
                }
            }
        }
    }
}