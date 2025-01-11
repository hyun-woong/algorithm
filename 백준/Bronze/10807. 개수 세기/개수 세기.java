import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] arr = br.readLine().split(" ");
        String target = br.readLine();
        int result = Arrays.stream(arr).filter(v -> v.equals(target)).toArray().length;

        System.out.println(result);
    }
}