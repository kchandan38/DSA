package com.datastructure.bitwiseoperations;

//Check Kth bit is set or not set for the given number.
public class Lab11 {

    public static void main(String[] args) {

        int n = 15;
        int k = 3;

        for (int i = 0; i < (k-1); i++) {
            n = n>>1;//Shifting one bit at a time
        }
        if((n &1)!= 0){
            System.out.println("Kth bit is set");
        }else {
            System.out.println("Kth bit is not set");
        }
    }
}
