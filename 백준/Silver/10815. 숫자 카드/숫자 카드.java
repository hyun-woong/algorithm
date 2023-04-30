import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> getList = new HashSet<>();
        List<String> containList = new ArrayList<>();
        int cnt = 0;
        while (cnt < 4) {
            String txt = br.readLine();
            if (txt.isEmpty()) {
                br.close();
                break;
            }
            if (cnt == 1) {
                getList.addAll(Arrays.asList(txt.split(" ")));
            } else if (cnt == 3) {
                containList.addAll(Arrays.asList(txt.split(" ")));
            }
            cnt++;
        }
        StringBuilder sb = new StringBuilder();

        for (String i : containList) {
            String result = getList.contains(i) ? "1" : "0";
            sb.append(result).append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
}