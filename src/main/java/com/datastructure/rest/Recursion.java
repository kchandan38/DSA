package com.datastructure.rest;

public class Recursion {
    static void printAll(int n){
        if(n==0)
            return;
        else {
            System.out.print(n+"\t");
            printAll(n - 1);
        }
    }
    public static void main(String[] args) {
        printAll(5);
    }
}
