package com.datastructure.loopsandnumbers;

//WAP to Find the Number of Divisibles of the given Number.
public class Lab7 {

    public static void main(String[] args) {

        int n = 17;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0)
                count++;
        }
        System.out.println(count);

    }
}
