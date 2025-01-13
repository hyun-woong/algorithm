import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 30; i++) list.add(i);
        
        while (line != null) {
            int cnvt = Integer.parseInt(line);
            int idx = list.indexOf(cnvt);
            list.remove(idx);
            if (list.size() == 2) break;
            line = br.readLine();
        }

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}