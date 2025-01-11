import java.io.*;
import java.util.StringTokenizer;

public class Main {
 public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int expect = Integer.parseInt(br.readLine());
    int totalItem = Integer.parseInt(br.readLine());

    int actual = 0;

    for (int i = 0; i < totalItem; i++) {
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int price = Integer.parseInt(token.nextToken());
        int buy = Integer.parseInt(token.nextToken());

        actual += price * buy;
    }

    String result = expect == actual ? "Yes" : "No";
    System.out.println(result);
}   
}