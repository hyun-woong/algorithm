import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] xn = br.readLine().split(" ");
        int[] xxn = new int[n];
        for (int i = 0; i < n; i++) {
            xxn[i] = Integer.parseInt(xn[i]);
        }
        int m = Integer.parseInt(br.readLine());
        String[] mn = br.readLine().split(" ");
        int[] mmn = new int[m];
        for (int i = 0; i < m; i++) {
            mmn[i] = Integer.parseInt(mn[i]);
        }
        Arrays.sort(xxn);
        StringBuilder answer_ = new StringBuilder();
        for (int i = 0; i < mmn.length; i++) {
            answer_.append(binarySearch(xxn, mmn[i])).append("\n");
        }
        System.out.println(answer_);
    }
    public static int binarySearch(int[] nList, int searchNum) {
        int start = 0;
        int end = nList.length - 1;
        int cursor = (start + end) / 2;
        while (start <= end) {
            if (nList[cursor] == searchNum) {
                return 1;
            } else if (nList[cursor] < searchNum) {
                start = cursor + 1;
            } else if (nList[cursor] > searchNum){
                end = cursor - 1;
            }
            cursor = (start + end) / 2;
        }
        return 0;
    }
}