package com.datastructure.bitwiseoperations;

//Count the number of Set Bits in given number.
public class Lab12 {

    public static void main(String[] args) {

        int n = 15;
        int k = 3;
        int count = 0;

        while (n > 0) {
            if ((n & 1) != 0)
                count++;
            n = n >> 1;
        }
        System.out.println("No of bits " + count);
    }
}
