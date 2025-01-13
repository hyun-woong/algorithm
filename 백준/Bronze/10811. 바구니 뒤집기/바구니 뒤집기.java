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
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (start == end) continue;

            cnvt(start, end, arr);
        }

        System.out.println(String.join(" ", arr));
    }

    private static void cnvt(int a, int b, String[] arr) {
        String[] temp = arr.clone();
        int idx = a-1;
        for (int i = b - 1; i > a - 1; i--) {
            arr[idx] = temp[i];
            arr[i] = temp[idx];
            idx++;
        }
    }

}

