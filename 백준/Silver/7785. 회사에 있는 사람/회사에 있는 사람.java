import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        Set<String> enterLog = new LinkedHashSet<>();

        for (int i = 0; i < cnt; i++) {
            String[] log = br.readLine().split(" ");
            if (log[1].equals("enter")) {
                enterLog.add(log[0]);
            } else if(log[1].equals("leave")) {
                enterLog.remove(log[0]);
            }
        }


        List<String> collect = enterLog.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for (String stay : collect) {
            System.out.println(stay);
        }

    }
}