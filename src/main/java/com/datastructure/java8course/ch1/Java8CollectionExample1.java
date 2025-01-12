package com.datastructure.java8course.ch1;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Java8CollectionExample1 {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Example");
        arrayList.add("ABC");
        arrayList.add("XY");
        arrayList.add("SYA");
        arrayList.add("ADDADa");
        int counter = 0;
        for (String str: arrayList) {
            if(str.length()==3)
                counter++;
        }
        System.out.println(counter);
        long count = arrayList.stream().filter(str->str.length()==0).count();
        System.out.println("Number of string which length 3 is equal to " + count);

    }
}
