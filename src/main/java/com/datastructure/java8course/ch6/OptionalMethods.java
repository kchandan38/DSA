package com.datastructure.java8course.ch6;


import java.util.Optional;

public class OptionalMethods {

    public static void main(String[] args) {


        Optional<Integer> integerOptional = Optional.of(30);
        System.out.println(integerOptional.map(i->i*2).get());

    }


}
