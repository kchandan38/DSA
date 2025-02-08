package DataStructure.rest;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LexicographicalExample {

    public static void main(String[] args) {

        String[] str = {"Alen","Chandan","Puja","Swati","Baby"};
        Arrays.sort(str);

        for (String name: str) {
            System.out.println(name);
        }
        System.out.println("____________________________________________");
        List<String> sortedList = Arrays.stream(str)
                                        .sorted().peek(s-> System.out.println(s))
                                        .collect(Collectors.toList());
        System.out.println(sortedList);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(40);
        treeSet.add(40);treeSet.add(20);treeSet.add(140);treeSet.add(240);

        System.out.println(treeSet);








    }
}
