import java.io.*;
import java.lang.String;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cnt = br.readLine().split(" ");
        int n = Integer.parseInt(cnt[0]);
        int m = Integer.parseInt(cnt[1]);

        Map<String, String> nList = new HashMap<>();
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < n+m; i++) {
            String nm = br.readLine();
            if (i < n) {
                nList.put(nm, nm);
            } else {
                if (!Objects.isNull(nList.get(nm))) {
                    resultList.add(nm);
                }
            }
        }

        System.out.println(resultList.size());

        resultList = resultList.stream().sorted().collect(Collectors.toList());
        for (String nm : resultList) {
            System.out.println(nm);
        }

    }
}