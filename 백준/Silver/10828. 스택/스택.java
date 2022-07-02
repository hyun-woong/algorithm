import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            String n = br.readLine();
            if (n.contains(" ")) {
                StringTokenizer st = new StringTokenizer(n, " ");
                String o = st.nextToken();
                String z = st.nextToken();
                if (o.equals("push")) {
                    stack.push(Integer.valueOf(z));
                }
            } else {
                if (n.equals("top") && stack.empty()) {
                    sb.append("-1" + "\n");
                } else if (n.equals("top") && !stack.empty()) {
                    sb.append(stack.peek() + "\n");
                } else if (n.equals("size")) {
                    sb.append(stack.size() + "\n");
                } else if (n.equals("empty") && stack.empty()) {
                    sb.append("1" + "\n");
                } else if (n.equals("empty") && !stack.empty()) {
                    sb.append("0" + "\n");
                } else if (n.equals("pop") && !stack.empty()) {
                    sb.append(stack.pop() + "\n");
                } else if (n.equals("pop") && stack.empty()) {
                    sb.append("-1" + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}