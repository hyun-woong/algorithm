import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int V = Integer.parseInt(token.nextToken());

        int res = (int) Math.ceil((double) (V - B) / (A - B));
        System.out.println(res);
    }
}