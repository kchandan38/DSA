package com.datastructure.java8course.ch4;

public class MathodArguments {

    public static void main(String[] args) {

        System.out.println(runTester(Str->Str.length()>5, "Chandan"));
        System.out.println(runTester(S->S.startsWith("h"), "Chandan"));
    }
    public static boolean runTester(Tester t, String str) {
        return t.test(str);
    }
}
