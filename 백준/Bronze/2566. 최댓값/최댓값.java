import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int max = 0;
        int[] xy = new int[2];
        int y = 1;
        while (line != null) {
            String[] row = line.split(" ");
            for (int i = 0; i < row.length; i++) {
                int current = Integer.parseInt(row[i]);
                if (max > current) continue;
                max = current;
                xy[0] = i +1;
                xy[1] = y;
            }

            y++;
            line = br.readLine();
        }

        System.out.println(max);
        System.out.println(xy[1] + " " + xy[0]);
    }
}