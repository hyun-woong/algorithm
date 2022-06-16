package com.example.algorithm.level03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(a + b);
        }
    }





//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int x = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            int a = scanner.nextInt();
//            if (a < x) {
//                System.out.println(a);
//            }
//        }
//    }





//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= n - i; j++) {
//                    System.out.print(" ");
//                }
//                for (int z = 0; z < i; z++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }







//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            int n = scanner.nextInt();
//
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }




//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//
//            int answer = a + b;
//
//            System.out.println("Case #" + i + ":  " + a + " + " + b + " = " + answer);
//        }
//    }



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//
//            int answer = a + b;
//
//            System.out.println("Case #" + i + ":  " + answer);
//        }
//    }




//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        List<Integer> answer = new ArrayList<>();
//
//        for (int i = 1; i <= n; i++) {
//            answer.add(i);
//        }
//
//        Collections.sort(answer, Collections.reverseOrder());
//
//        for (int t : answer) {
//            System.out.println(t);
//        }
//    }



//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int testCnt = Integer.parseInt(br.readLine());
//        int result;
//
//        for (int i = 0; i < testCnt; i++) {
//            String AB = br.readLine();
//            StringTokenizer st = new StringTokenizer(AB, " ");
//
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            result = a + b;
//
//            bw.write(String.valueOf(result));
//            bw.write("\n");
//        }
//        bw.flush();
//    }



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int answer = 0;
//
//        for (int i = 0; i <= n; i++) {
//            answer += i;
//        }
//        System.out.println(answer);
//    }



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println(a + b);
//        }
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int A = scanner.nextInt();
//
//        for (int i = 1; i < 10; i++) {
//            int answer = A * i;
//            System.out.println(A + " * " + i + " = " + answer);
//        }
//    }
}
