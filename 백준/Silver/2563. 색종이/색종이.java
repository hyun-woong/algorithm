import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int totalW = Integer.parseInt(line) * 100;

        int[][] map = new int[100][100];
        line = br.readLine();
        
        int overlay = 0;
        while (line != null) {
            StringTokenizer token = new StringTokenizer(line, " ");
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    int t = map[i][j];
                    if (t > 0) overlay++;
                    map[i][j] += 1;
                }
            }

            line = br.readLine();
        }
        
        System.out.println(totalW - overlay);
    }
}