package com.datastructure.java8course.ch1;

import java.time.LocalDateTime;

public class ComparingDates {

    public static void main(String[] args) {

        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2000,8,23, 2, 30);

        System.out.println(ldt1.compareTo(ldt2));

    }
}
