package com.example.algorithm.level01;

import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A > 0 && B < 10) {
            System.out.println(A+B);
        }
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A > 0 && B < 10) {
            System.out.println(A-B);
        }
    }
}