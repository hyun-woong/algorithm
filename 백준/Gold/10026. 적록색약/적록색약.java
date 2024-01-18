import java.io.*;

public class Main {
    private static String[][] arr;
    private static boolean[][] visited;
    private static int[] dx = {-1, 0, 0, 1};
    private static int[] dy = {0, 1, -1, 0};
    private static int n;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        init();
        insertArr(br);
        
        int normal = searchDFS(true);
        
        initVisited();
        int abnormal = searchDFS(false);
        
        System.out.println(normal + " " + abnormal);
    }
    
    private static void init() {
        arr = new String[n+1][n+1];
        initVisited();
    }
    
    private static void initVisited() {
        visited = new boolean[n+1][n+1];
    }
    
    private static void insertArr(BufferedReader br) throws IOException {
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < line.length; j++) arr[i][j] = line[j];
        }
    }
    
    private static int searchDFS(boolean isNormal) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    DFS(i, j, isNormal);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    private static void DFS(int x, int y, boolean isNormal) {
        String color = isNormal ? arr[x][y] : getAbnormalColor(arr[x][y]);
        visited[x][y] = true;
        
        for (int i = 0; i < 4; i++) {
            int renewX = x + dx[i];
            int renewY = y + dy[i];
            
            boolean isInvalidIdx = renewX < 0 || renewY < 0 || renewX >= n || renewY >= n;
            if (isInvalidIdx || visited[renewX][renewY]) continue;
            
            String renewColor = isNormal ? arr[renewX][renewY] : getAbnormalColor(arr[renewX][renewY]);
            if (renewColor.equals(color)) {
                visited[renewX][renewY] = true;
                DFS(renewX, renewY, isNormal);
            }
        }
    }
    
    /** 적록색약 일 때 녹색을 붉은색으로 치환 */
    private static String getAbnormalColor(String currentColor) {
        boolean isRG = currentColor.equals("R") || currentColor.equals("G");
        return isRG ? "R" : currentColor;
    }
}