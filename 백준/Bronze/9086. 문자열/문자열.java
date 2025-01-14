import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String given = br.readLine();
            if (given.length() == 1) {
                System.out.println(given + given);
                continue;
            }

            String res = given.substring(0, 1) + given.substring(given.length() - 1);
            System.out.println(res);
        }
    }
}

