import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> res = new ArrayList<>();

        String line = br.readLine();
        while (line != null) {
            String[] arr = line.split("");
            for (int i = 0; i < arr.length; i++) {
                if (res.size() < i+1) { res.add(i, arr[i]); }
                else { res.set(i, res.get(i) + arr[i]); }
            }

            line = br.readLine();
        }
        
        System.out.print(String.join("", res));
    }
}

