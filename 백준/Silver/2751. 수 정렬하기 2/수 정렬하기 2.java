import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(Integer.parseInt(br.readLine()));
        }
        br.close();
        Collections.sort(x);
        StringBuffer re = new StringBuffer();
        for (int t : x) {
            re.append(t).append("\n");
        }
        bw.write(String.valueOf(re));
        bw.flush();
        bw.close();
    }
}