import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());
        
        List<Integer> coins = new ArrayList<>();
        for (int i = 0; i < n; i++) coins.add(Integer.parseInt(br.readLine()));
        
        int result = 0;
        for (int i = n-1; i >= 0;) {
            int coin = coins.get(i);
            if (coin > k) {
                i--;
                continue;
            }
            
            if (k - coin >= 0) {
                k = k - coin;
                result++;
            }
            if (k == 0) break;
        }
         System.out.println(result);
    }
}