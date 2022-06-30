import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] x = n.split("");
        Arrays.sort(x, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String t : x) {
            sb.append(t);
        }
        System.out.println(sb);
    }
}