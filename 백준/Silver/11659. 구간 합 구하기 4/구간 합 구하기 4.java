import java.io.*;
import java.lang.String;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] readLine = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] narray = br.readLine().split(" ");
        int[] sumArray = new int[narray.length + 1];
        sumArray[0] = 0;
        for (int i = 1; i < sumArray.length; i++) {
            sumArray[i] = sumArray[i-1] + Integer.parseInt(narray[i-1]);
        }
        int cnt = readLine[1];
        while(cnt != 0) {
            int[] read = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            cnt--;
            int result = sumArray[read[1]] - sumArray[read[0]-1];
            System.out.println(result);
        }
    }
}