import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        List<String[]> list = new ArrayList<>();

        int idx = 0;
        int subIdx = 0;
        String line = br.readLine();
        while (line != null) {
            if (idx < N) {
                list.add(line.split(" "));
                idx++;
            } else {
                String[] target = list.get(subIdx);
                String[] current = line.split(" ");

                for (int i = 0; i < target.length; i++) {
                    int x = Integer.parseInt(target[i]);
                    int y = Integer.parseInt(current[i]);
                    System.out.print(x + y);
                    if (i < target.length -1) System.out.print(" ");
                }

                System.out.println();
                subIdx++;
            }

            line = br.readLine();
        }
    }
}