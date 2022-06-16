package com.example.algorithm.level04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            int a = scanner.nextInt();
            integerList.add(a);
        }

        Integer max = integerList.stream()
                .mapToInt(y -> y)
                .max()
                .getAsInt();

        Integer min = integerList.stream()
                .mapToInt(y -> y)
                .min()
                .getAsInt();
        System.out.println(min);
        System.out.println(max);
    }
}
