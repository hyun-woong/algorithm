package com.example.algorithm.level02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int needM = scanner.nextInt();

        int H = h * 60 + m + needM;

        int aH = H / 60;
        int aM = H % 60;

        if (aH >= 24) {
                aH -= 24;
        }

        System.out.println(aH + " " + aM);
    }




//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int h = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        if (h == 0) {
//            h = 24;
//        }
//
//        int hm = h * 60;
//        int answer = hm + m - 45;
//
//        int H = answer / 60;
//        int M = answer % 60;
//
//        if (H == 24) {
//            H = 0;
//        }
//
//        System.out.println(H +" " + M);
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//        int[] intArrays = new int[]{x, y, z};
//
//
//        if (x == y && x == z) {
//            System.out.println(10000 + x * 1000);
//        } else if (x != y && x != z && y != z) {
//            IntStream intStream = Arrays.stream(intArrays);
//            OptionalInt optionalInt = intStream.max();
//            int maxAsInt = optionalInt.getAsInt();
//
//            System.out.println(maxAsInt * 100);
//        } else {
//            if (x == y && x != z) {
//                System.out.println(1000 + x * 100);
//            } else if(x != y && x == z) {
//                System.out.println(1000 + x * 100);
//            }else {
//                System.out.println(1000 + y * 100);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//
//        if (x > 0 && y > 0){
//            System.out.println("1");
//        } else if (x < 0 && y > 0) {
//            System.out.println("2");
//        } else if (x < 0 && y < 0) {
//            System.out.println("3");
//        } else {
//            System.out.println("4");
//        }
//    }




//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//
//        if (a%4 == 0 && a%100 != 0 || a%400 ==0){
//            System.out.println("1");
//        }else {
//            System.out.println("0");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//
//        if (a >= 90) {
//            System.out.println("A");
//        } else if (a >= 80 && a <= 89){
//            System.out.println("B");
//        } else if (a >= 70 && a <= 79){
//            System.out.println("C");
//        } else if (a >= 60 && a <= 69) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }
//    }



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        if (a > b) {
//            System.out.println(">");
//        } else if (a < b){
//            System.out.println("<");
//        } else {
//            System.out.println("==");
//        }
//    }
}
