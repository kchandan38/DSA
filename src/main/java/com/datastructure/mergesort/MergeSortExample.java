package com.datastructure.mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortExample {

    public static void main(String[] args) {

        List<Integer> al = List.of(2,3,23,545,656,3,23,1,3,434,5465,1232,434);
        al.stream().filter(s->s%2==0).forEach(System.out::println);
    }
}
