import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] given = br.readLine().split(" ");
        int[] res = new int[given.length];

        for (int i = 0; i < given.length; i++) {
            int v = Integer.parseInt(given[i]);

            switch (i) {
                case 0:
                case 1:
                    res[i] = v == 1 ? 0 : 1 - v;
                    System.out.print(res[i] + " ");
                    break;
                case 5:
                    res[i] = v == 8 ? 0 : 8 - v;
                    System.out.print(res[i]);
                    break;
                default:
                    res[i] = v == 2 ? 0 : 2 - v;
                    System.out.print(res[i] + " ");
            }
        }
    }
}