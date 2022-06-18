import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            int x_ = Integer.parseInt(br.readLine());
                list.add(x_);
        }
        Collections.sort(list);
        for (int s : list) {
            System.out.println(s);
        }
    }
}