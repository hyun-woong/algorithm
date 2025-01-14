import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        List<String> list = Arrays.asList(line.split(""));

        for (int i = 0; i < arr.length; i++) arr[i] = String.valueOf(list.indexOf(arr[i]));

        System.out.println(String.join(" ", arr));
    }

}

