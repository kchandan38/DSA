package com.datastructure.java8course.ch1;

public class StringBuffers {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("Helloo".toLowerCase());
        StringBuffer sb2 = new StringBuffer("hhello");

        System.out.println(sb1.compareTo(sb2));

    }
}
