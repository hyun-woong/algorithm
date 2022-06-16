package com.example.algorithm.level04;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int x = a * b * c;

        String y = String.valueOf(x);
        List<String> arrList = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < y.length(); i++) {
            String z = String.valueOf(y.charAt(i));
            arrList.add(z);
        }

        for (String arr : arrList) {
            Integer cnt = map.get(arr);
            if (cnt == null) {
                map.put(arr, 1);
            } else {
                map.put(arr, cnt +1);
            }
        }

        for (int i = 0; i < 10; i++) {
            String v = String.valueOf(i);
            if (map.get(v) == null){
                System.out.println("0");
            } else {
                System.out.println(map.get(v));
            }
        }
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<Integer> integerList = new ArrayList<>();
//
//        for (int i = 0; i < 9; i++) {
//            int a = scanner.nextInt();
//            integerList.add(a);
//        }
//
//        Integer max = integerList.stream()
//                .mapToInt(y -> y)
//                .max()
//                .getAsInt();
//
//        System.out.println(max);
//        System.out.println(integerList.indexOf(max) + 1);
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        List<Integer> integerList = new ArrayList<>();
//
//        for (int i = 0; i < x; i++) {
//            int a = scanner.nextInt();
//            integerList.add(a);
//        }
//
//        Integer max = integerList.stream()
//                .mapToInt(y -> y)
//                .max()
//                .getAsInt();
//
//        Integer min = integerList.stream()
//                .mapToInt(y -> y)
//                .min()
//                .getAsInt();
//        System.out.println(min);
//        System.out.println(max);
//    }
}
