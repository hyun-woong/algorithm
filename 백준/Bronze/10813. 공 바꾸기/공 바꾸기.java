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

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) arr[i] = String.valueOf(i+1);

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken()) -1;
            int b = Integer.parseInt(st.nextToken()) -1;

            String tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        
        System.out.println(String.join(" ", arr));
    }
}