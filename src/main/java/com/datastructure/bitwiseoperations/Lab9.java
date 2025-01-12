package com.datastructure.bitwiseoperations;
//Check the given number is odd or even using bitwise operator
public class Lab9 {

    public static void main(String[] args) {

        int n = 81;
        if((n & 1)!= 0){
            System.out.println("Old");
        }else {
            System.out.println("Even");
        }
    }
}
