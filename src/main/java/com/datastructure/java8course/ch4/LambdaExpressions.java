package com.datastructure.java8course.ch4;

import java.util.Calendar;

public class LambdaExpressions {

    static boolean test(String str){

        String s = str.substring(1, str.length()-1);
        System.out.println(s);
        if(s.length()==str.length())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Calculator calculator1  = (a, b) ->  a+b;
        Calculator calculator2  = (double a, double b) -> {return a+b;};

        Create theCreate = ()-> "Hi There!!!";
        System.out.println(theCreate.create());

        //Single line statement
        Tester tester1 = str -> str.length()>5;
        System.out.println(tester1.test("Chan"));

        //Multiple line statement with lambda
        Tester tester2 = str -> {

            String s = str.substring(1, str.length()-1);
            System.out.println(s);
            if(s.length()==str.length())
                return true;
            else
                return false;
        };
        System.out.println(tester2.test("Chandan"));

        //Multiple line statement without lambda
        System.out.println(test("Chandan"));

    }
}
