package com.example.algorithm.level02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a%4 == 0 && a%100 != 0 || a%400 ==0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }





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
