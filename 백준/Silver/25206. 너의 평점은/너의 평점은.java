import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Float> avg = new HashMap<>();
        avg.put("A+", 4.5F);
        avg.put("A0", 4.0F);
        avg.put("B+", 3.5F);
        avg.put("B0", 3.0F);
        avg.put("C+", 2.5F);
        avg.put("C0", 2.0F);
        avg.put("D+", 1.5F);
        avg.put("D0", 1.0F);
        avg.put("F", 0.0F);

        int cnt = 0;

        float sumGradesAndAvg = 0F;
        float sumMyGrades = 0F;

        while (cnt < 20) {
            String[] target = br.readLine().split(" ");
            if (!target[2].equals("P")) {
                float myRank = Float.parseFloat(target[1]);
                float result = myRank * avg.get(target[2]);
                sumGradesAndAvg += result;
                sumMyGrades += myRank;
            }
            cnt++;
        }
        float result = sumGradesAndAvg / sumMyGrades;
        System.out.println(result);
    }
}