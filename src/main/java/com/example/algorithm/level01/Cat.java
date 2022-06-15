package com.example.algorithm.level01;

import java.util.Scanner;

public class Cat {
//    public static void main(String[] args) {
//        System.out.println("|\\_/|");
//        System.out.println("|q p|   /}");
//        System.out.println("( 0 )\"\"\"\\");
//        System.out.println("|\"^\"`    |");
//        System.out.println("||_/=\\\\__|");
//    }
//    public static void main(String[] args) {
//        System.out.println("\\    /\\");
//        System.out.println(" )  ( ')");
//        System.out.println("(  /  )");
//        System.out.println(" \\(__)|");
//    }
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    String A = scanner.next();
//
//    System.out.println(A + "??!");
//}

    public static void main(String[] args) {
        //543
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        if (1000 <= y && y <= 3000) {
            System.out.println(y-543);
        }
    }
}
