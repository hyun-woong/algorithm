package com.example.algorithm.level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char N = br.readLine().charAt(0);
        byte num = (byte) N;
        System.out.println(num);
    }
}

