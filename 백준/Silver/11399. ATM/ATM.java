import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] arr = br.readLine().split(" ");
        
        List<Integer> sorted = Arrays.stream(arr).map(Integer::parseInt).sorted().collect(Collectors.toList());
        
        int cnt = 0;
        int sum = 0;
        for (int s : sorted) {
            cnt = cnt + s;
            sum = sum + cnt;
        }
        System.out.println(sum);
    }
}