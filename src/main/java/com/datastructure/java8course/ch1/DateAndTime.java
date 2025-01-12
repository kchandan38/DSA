package com.datastructure.java8course.ch1;

import java.time.*;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.of(2022,2,1);
        System.out.println(ld1);

        LocalDateTime ld2 = LocalDateTime.now();
        System.out.println(ld2);

        LocalDate ld3 = LocalDate.of(2033, Month.JANUARY, 23);
        System.out.println(ld3);
        System.out.println(LocalDate.of(2033, Month.JANUARY, 23).getDayOfWeek());

        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }

}
