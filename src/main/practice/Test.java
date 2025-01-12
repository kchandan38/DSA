import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Optional.*;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        
       int[] data = {2,4,7,8,9,10,11};
       Arrays
               .stream(data)
               .filter(x->x%2==0)
               .map(n->n*n)
               .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(2, 4, 6, 1, 3, 5);

        List<Integer> copyList = new ArrayList<>(List.copyOf(numbers));
        copyList.add(4);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

        List<String> list = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","");

        list.stream().filter(l->l.startsWith("M")||l.startsWith("T")).forEach(System.out::println);

       // System.out.println(list);

        String s = "C";
       // System.out.println(Arrays.toString(s.getBytes()));

        List<String> list1 = new ArrayList<>();
        list1.add("Sunday");
        list1.add("Monday");
        list1.add("Tuesday");
        list1.add("Wednesday");
        list1.add("Thursday");
        list1.add("Friday");
        list1.add("Saturday");
        list1.add("Sunday");
       // System.out.println(list1);
    }
}
