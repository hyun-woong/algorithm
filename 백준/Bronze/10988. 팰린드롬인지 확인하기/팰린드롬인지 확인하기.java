import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] given = br.readLine().split("");

        int result = 1;
        int idx = 0;
        for (int i = given.length - 1; i > 0; i--) {
            if (!given[idx].equals(given[i])) result = 0;
            if (result == 0) break;
            idx++;
        }

        System.out.print(result);
    }
}

