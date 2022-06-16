package com.example.algorithm.level04;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        for (int i = 0; i < a; i++){
            String x = scanner.next();
            char[] arr = x.toCharArray();
            int cnt = 0;
            int answer = 0;
            for (int j = 0; j < arr.length; j++) {
                String str = String.valueOf(arr[j]);
                if (str.equals("O")) {
                    cnt++;
                    answer += cnt;
                } else {
                    cnt = 0;
                }
                }
            System.out.println(answer);
            }
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        List<Double> numList = new ArrayList<>();
//        double cnt = 0;
//
//        for (int i = 0; i < m; i++) {
//            double a = scanner.nextDouble();
//            numList.add(a);
//        }
//
//        Double max = numList.stream()
//                .mapToDouble(x -> x)
//                .max()
//                .getAsDouble();
//
//        for (double t : numList) {
//            double answer = t/max * 100;
//            cnt += answer;
//        }
//        System.out.println(cnt / m);
//    }

//    Integer max = integerList.stream()
//                .mapToInt(y -> y)
//                .max()
//                .getAsInt();

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < 10; i++) {
//            int a = scanner.nextInt();
//            int answer = a % 42;
//            set.add(answer);
//        }
//        System.out.println(set.size());
//
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        int x = a * b * c;
//
//        String y = String.valueOf(x);
//        List<String> arrList = new ArrayList<>();
//
//        Map<String, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < y.length(); i++) {
//            String z = String.valueOf(y.charAt(i));
//            arrList.add(z);
//        }
//
//        for (String arr : arrList) {
//            Integer cnt = map.get(arr);
//            if (cnt == null) {
//                map.put(arr, 1);
//            } else {
//                map.put(arr, cnt +1);
//            }
//        }
//
//        for (int i = 0; i < 10; i++) {
//            String v = String.valueOf(i);
//            if (map.get(v) == null){
//                System.out.println("0");
//            } else {
//                System.out.println(map.get(v));
//            }
//        }
//    }


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
