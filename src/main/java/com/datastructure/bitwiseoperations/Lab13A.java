package com.datastructure.bitwiseoperations;

//Find whether the given number is power of 2 or not
public class Lab13A {

    public static void main(String[] args) {

        int n = 64;

        int t = n & (n-1);

        if(n == 0) {
            System.out.println("Given number is the power of 2");
        } else
            System.out.println("Given number isn't the power of 2");
    }
}
