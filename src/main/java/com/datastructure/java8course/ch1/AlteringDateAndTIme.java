package com.datastructure.java8course.ch1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class AlteringDateAndTIme {

    public static void main(String[] args) {

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        LocalDateTime ldt2 = ldt1.plusMonths(6);
        System.out.println(ldt2);
        System.out.println(ldt1.plus(Period.ofWeeks(4)));
        System.out.println(ldt1.plus(Duration.ofHours(3)));
    }
}
