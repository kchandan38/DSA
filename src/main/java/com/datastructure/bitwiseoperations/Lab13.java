package com.datastructure.bitwiseoperations;

//Find whether the given number is power of 2 or not
public class Lab13 {

    public static void main(String[] args) {

        int n = 64;
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        if(count==1)
            System.out.println("Given number is the power of 2");
        else
            System.out.println("Given number isn't the power of 2");
    }
}
