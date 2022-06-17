package com.example.algorithm.level05;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        char[] reX = x.toCharArray();

        Map<String, Integer> maps = new HashMap<>();
        maps.put("ABC", 3);
        maps.put("DEF", 4);
        maps.put("GHI", 5);
        maps.put("JKL", 6);
        maps.put("MNO", 7);
        maps.put("PQRS", 8);
        maps.put("TUV", 9);
        maps.put("WXYZ", 10);

        int answer = 0;

        for (char t : reX) {
            Map<String, Integer> result = maps.entrySet().stream()
                    .filter(entry -> entry.getKey().contains(String.valueOf(t)))
                    .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));

            String re = String.valueOf(result.keySet())
                    .replace("[", "")
                    .replace("]", "");

           answer += maps.get(re);
        }
        System.out.println(answer);
    }






//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String x = br.readLine();
//
//        String[] a = x.split(" ");
//
//        char[] a1 = a[0].toCharArray();
//        char[] a2 = a[1].toCharArray();
//
//        StringBuilder re_a = new StringBuilder();
//        StringBuilder re_a2 = new StringBuilder();
//
//        for (int i = 2; i >= 0; i--) {
//            re_a.append(String.valueOf(a1[i]));;
//            re_a2.append(String.valueOf(a2[i]));
//        }
//
//        if (Integer.parseInt(String.valueOf(re_a)) < Integer.parseInt(String.valueOf(re_a2))) {
//            System.out.println(re_a2);
//        } else {
//            System.out.println(re_a);
//        }
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String x = br.readLine();
//        String upper = x.toUpperCase();
//
//        char[] arr = upper.toCharArray();
//
//        Map<String, Integer> cntMap = new HashMap<>();
//
//        for (char z : arr) {
//            String zz = String.valueOf(z);
//            cntMap.put(zz, cntMap.containsKey(zz) ? cntMap.get(zz) + 1 : 1);
//        }
//        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        };
//
//        Map.Entry<String, Integer> maxEntry = Collections.max(cntMap.entrySet(), comparator);
//
//        int cnt = 0;
//        for (String n : cntMap.keySet()) {
//            if (Objects.equals(cntMap.get(n), maxEntry.getValue())) {
//                cnt++;
//            }
//        }
//        if (cnt > 1) {
//            System.out.println("?");
//        }else {
//            System.out.println(maxEntry.getKey());
//        }
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String x = br.readLine();
//        String[] arr = x.split(" ");
//        List<String> strs = new ArrayList<>();
//
//        for (String a : arr) {
//            if (!a.equals("")){
//                strs.add(a);
//            }
//        }
//        System.out.println(strs.size());
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//        for (int i = 0; i < n; i++) {
//            String x = br.readLine(); // 문자열
//            int a = Integer.parseInt(x.split(" ")[0]);
//            StringBuilder answer = new StringBuilder();
//            char[] arr = x.split(" ")[1].toCharArray();
//            for (char c : arr) {
//                for (int z = 0; z < a; z++) {
//                    answer.append(c);
//                }
//            }
//            System.out.println(answer.toString());
//        }
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String t = br.readLine();
//
//        char[] arr = t.toCharArray();
//        int cnt = 0;
//
//        for (char w : arr) {
//            int cw = Integer.parseInt(String.valueOf(w));
//            cnt += cw;
//        }
//        System.out.println(cnt);
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char N = br.readLine().charAt(0);
//        byte num = (byte) N;
//        System.out.println(num);
//    }
}

