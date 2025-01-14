import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        list.add("*");
        for (int i = 1; i < N; i++) list.add(list.get(i - 1) + "**");

        int max = list.get(list.size() - 1).length();
        for (int i = 0; i <= list.size()-1; i++) resultPrint(list.get(i), max);
        for (int i = list.size()-2; i >= 0; i--) resultPrint(list.get(i), max);
    }

    private static void resultPrint(String currentStr, int max) {
        printSpace(max, currentStr);
        System.out.println(currentStr);
    }
    
    private static void printSpace(int max, String currentStr) {
        int space = (max - currentStr.length()) / 2;
        for (int i = 0; i < space; i++) System.out.print(" ");
    }
}