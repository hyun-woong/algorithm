import java.io.*;
import java.util.*;

public class Main {
    private static int result = 0;
    private static int[][] arr;
    private static int previousEndTime;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][2];
        
        for (int i = 0; i < n; i++) init(new StringTokenizer(br.readLine()), i);
        
        arrSortOrderByEndTime();
        previousEndTime = arr[0][1];
        result++;
        
        for (int i = 1; i < arr.length; i++) search(i);
        System.out.println(result);
    }
    
    private static void init(StringTokenizer token, int idx) {
        int start = Integer.parseInt(token.nextToken());
        int end = Integer.parseInt(token.nextToken());
        arr[idx] = new int[]{start, end};
    }
    
    private static void arrSortOrderByEndTime() {
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) return o1[0] - o2[0];
            return o1[1] - o2[1];
        });
    }
    
    private static void search(int idx) {
        if (previousEndTime <= arr[idx][0]) {
            previousEndTime = arr[idx][1];
            result++;
        }
    }
}