package com.datastructure.java8course.ch1;

public class PrintBinary {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = ~a;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);

    }
}
