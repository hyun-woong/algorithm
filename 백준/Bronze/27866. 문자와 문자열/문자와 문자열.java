import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        int idx = Integer.parseInt(br.readLine()) - 1;
        System.out.print(arr[idx]);
    }
}