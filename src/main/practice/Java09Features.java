import java.util.*;

public class Java09Features {

    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);// Java 8
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5); // Java 9 Immutable variable
        var numbers3 = List.of(1, 2, 3, 4, 5); // Java 10
 numbers1.stream()
                .filter(integer -> integer%2==0)
                .forEach(System.out::println);

        List<Integer> evenNumbers1 = numbers1.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> eventList = numbers1
                .stream()
                .filter(n->n%2==0)
                .toList();
       // eventList.add(5);

        System.out.println(evenNumbers1);
     //   System.out.println(evenNumbers);

        Stack<String> stack = new Stack<>();
        String str = stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.remove(2);

        System.out.println(stack);



    }
}
