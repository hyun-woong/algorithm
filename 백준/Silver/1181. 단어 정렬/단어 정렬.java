import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> list = new HashMap<>();

        long totalCnt = Long.parseLong(br.readLine()) -1L;

        while (totalCnt >= 0) {
            String val = br.readLine();
            if (!list.containsKey(val)) {
                list.put(val, val.length());
            }
            totalCnt--;
        }

        List<String> entries = list.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue())
                .map(val -> {
                    return val.getKey();
                })
                .collect(Collectors.toList());

        for (String s : entries) {
            System.out.println(s);
        }
    }
}