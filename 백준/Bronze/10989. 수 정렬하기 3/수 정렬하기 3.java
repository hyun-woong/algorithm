import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        StringBuilder bu = new StringBuilder();
        for (int s : arr) {
            bu.append(s).append('\n');
        }
        System.out.println(bu);
    }
}