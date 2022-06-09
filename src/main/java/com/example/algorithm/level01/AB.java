package com.example.algorithm.level01;

import java.util.Scanner;

public class AB {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        if (A > 0 && B < 10) {
//            System.out.println(A+B);
//        }
//    }

//    public static void main2(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        if (A > 0 && B < 10) {
//            System.out.println(A-B);
//        }
//    }
//
//    public static void main1(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        if (A > 0 && B < 10) {
//            System.out.println(A*B);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double A = scanner.nextInt();
//        double B = scanner.nextInt();
//        if (A > 0 && B < 10) {
//            System.out.println(A/B);
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (1 <= A && B <= 10000) {
            System.out.println(A+B);
            System.out.println(A-B);
            System.out.println(A*B);
            System.out.println(A/B);
            System.out.println(A%B);
        }
    }
}