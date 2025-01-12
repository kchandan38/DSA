package com.datastructure.loopsandnumbers;

// 13) WAP to find sum of divisible of a given number
public class Lab13 {

    public static void main(String[] args) {

        int n =20;
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0)
                sum +=i;
        }
        System.out.println("Sum of divisible: " + sum);
        System.out.println(1234/10);

    }
}
