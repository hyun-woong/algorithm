import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        int x = (n - 4) / 4;

        String lastStr = "long int";

        for (int i = 0; i < x; i++) {
            System.out.print("long ");
        }

        System.out.println(lastStr);
    }
}