import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        String[] checks = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String t : checks) {
            if (x.contains(t)) {
                x = x.replace(t, "A");
            }
        }
        System.out.println(x.length());
    }
}