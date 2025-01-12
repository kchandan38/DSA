package com.datastructure.java8course.ch3;

import java.util.function.Predicate;

public class NoLambdaFunctionalInterface {
    public static void main(String[] args) {

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("C");
            }
        };

        System.out.println(predicate.test("Chandan"));
        System.out.println(predicate.test("Kumar"));
    }
}
