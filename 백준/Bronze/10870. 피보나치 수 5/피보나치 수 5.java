import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 1;
        int cnt = 1;
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (cnt == n) {
                break;
            }
            int tem = y;
            answer = x + y;
            y = x + y;
            x = tem;
            cnt += 1;
        }
        if (n == 0) {
            answer = 0;
        } else if (n == 1){
            answer = 1;
        }
        System.out.println(answer);
        }
}