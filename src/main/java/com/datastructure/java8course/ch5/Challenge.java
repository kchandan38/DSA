package com.datastructure.java8course.ch5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge {

    public static void main(String[] args) {

        List<Integer> al1 = Arrays.asList(2,3,4,5,6,6,3,4);
        List<Integer> al2 = Arrays.asList(3,8,6,5,6,5,3,2);

        System.out.println(Stream.of(al1,al2).flatMap(Collection::stream).collect(Collectors.toList()));

        //List<Integer> al3  = al1.stream().flatMap(al2);

        //System.out.println(al3);



//        String[] names = {"Chandan", "Rylee", "Tomas", "Tomas", "Angelique", "Youssef", "Maaike", "Ella",
//                "anya", "Satish", "Antony", "Jerry", "Fatima", "Swati", "Puja"};
//
//        List<String> nameList = Arrays.stream(names)
//                .filter(s -> s.toLowerCase().startsWith("a"))
//                .collect(Collectors.toList());
//        System.out.println(nameList);
//
//        Arrays.stream(names)
//                .map(name -> name.equals("Maaike") ? name : String.format("%s student", name))
//                .forEach(s -> System.out.println(s));
//
//        List<String> newNameList = nameList.stream()
//                .filter(s->!s.equals("Antony"))
//                .peek(s-> System.out.println(s))
//                .collect(Collectors.toList());
//
//        System.out.println(newNameList);
    }
}
