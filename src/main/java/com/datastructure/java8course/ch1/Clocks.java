package com.datastructure.java8course.ch1;

import java.time.Clock;
import java.time.Duration;

public class Clocks {

    public static void main(String[] args) {

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);
        System.out.println(clock.instant());

        System.out.println(Clock.systemUTC());
        System.out.println(Clock.systemUTC().instant());

        System.out.println(Clock.offset(clock, Duration.ofHours(24)).instant());

    }
}
