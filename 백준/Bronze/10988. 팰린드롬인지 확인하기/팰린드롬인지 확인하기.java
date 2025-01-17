import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(br.readLine());
        String x = sb.toString();
        String y = sb.reverse().toString();

        System.out.print(x.equals(y) ? 1 : 0);
    }
}

