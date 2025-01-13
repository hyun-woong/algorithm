import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        String line = br.readLine();
        String[] arr = new String[N];
        
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(line, " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            String num = st.nextToken();

            for (int j = start; j <= end; j++) arr[j-1] = num;

            line = br.readLine();
        }

        String result = String.join(" ", arr);
        result = result.replace("null", "0");

        System.out.println(result);
    }
}