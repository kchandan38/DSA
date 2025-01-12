import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.add("test");

        List<Integer> number = List.of();
        number.add(1);


        System.out.println(number);

        // Using a method reference to print each name
        names.forEach(System.out::println);
    }
}