package com.datastructure.bitwiseoperations;
//Check the last bit of a given number is set or not
public class Lab8 {

    public static void main(String[] args) {

        int n = 2;
        if((n & 1)!= 0){
            System.out.println("The last bit is not set");
        }else {
            System.out.println("The last bit is set");
        }
    }
}
