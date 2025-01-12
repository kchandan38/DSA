package com.datastructure.rest;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(fact(n));
    }

    private static int fact(int n) {

        int fact = 0;
        if (n == 1)
            return fact;
        fact = n * fact(n - 1);
        return fact;
    }
}
