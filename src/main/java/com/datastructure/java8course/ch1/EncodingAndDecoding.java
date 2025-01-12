package com.datastructure.java8course.ch1;

import java.util.Base64;

public class EncodingAndDecoding {

    public static void main(String[] args) {

        System.out.println("Bye");
        String encoded = Base64.getEncoder().encodeToString("Bye".getBytes());
        System.out.println(encoded);
        System.out.println(new String(Base64.getDecoder().decode(encoded)));

    }
}
