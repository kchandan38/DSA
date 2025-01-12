package com.datastructure.bitwiseoperations;

//Check Kth bit is set or not set for the given number with 0(1) time complexity.
public class Lab11A {

    public static void main(String[] args) {

        int n = 15;
        int k = 3;

        n = n>>k-1;//Shifting (K-1) times

        if((n &1)!= 0){
            System.out.println("Kth bit is set");
        }else {
            System.out.println("Kth bit is not set");
        }
    }
}
