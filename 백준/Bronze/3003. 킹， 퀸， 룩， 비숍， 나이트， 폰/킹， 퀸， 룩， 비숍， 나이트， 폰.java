import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] given = br.readLine().split(" ");

        for (int i = 0; i < given.length; i++) {
            int v = Integer.parseInt(given[i]);
            switch (i) {
                case 0:
                case 1:
                    System.out.print((1 - v) + " ");
                    break;
                case 5:
                    System.out.print(8 - v);
                    break;
                default:
                    System.out.print((2 - v) + " ");
            }
        }
    }
}