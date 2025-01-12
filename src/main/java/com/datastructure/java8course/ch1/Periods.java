package com.datastructure.java8course.ch1;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Periods {

    public static void main(String[] args) {

        Period p1 = Period.of(2,3,4);
        System.out.println(p1);

        Period p2 = Period.ofDays(1000);
        System.out.println(p2);

        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2023, 1,2);
        Period p3 = Period.between(ld2, ld1);
        System.out.println(p3);
        System.out.println(p3.getMonths() + " : " +p3.getDays());

        System.out.println(ChronoUnit.DAYS.between(ld2, ld1));
    }
}
