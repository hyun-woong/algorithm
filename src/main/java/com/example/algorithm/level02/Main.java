package com.example.algorithm.level02;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int[] intArrays = new int[]{x, y, z};


        if (x == y && x == z) {
            System.out.println(10000 + x * 1000);
        } else if (x != y && x != z && y != z) {
            IntStream intStream = Arrays.stream(intArrays);
            OptionalInt optionalInt = intStream.max();
            int maxAsInt = optionalInt.getAsInt();

            System.out.println(maxAsInt * 100);
        } else {
            if (x == y && x != z) {
                System.out.println(1000 + x * 100);
            } else if(x != y && x == z) {
                System.out.println(1000 + x * 100);
            }else {
                System.out.println(1000 + y * 100);
            }
        }
    }

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
