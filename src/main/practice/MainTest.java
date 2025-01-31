import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainTest {

    public static void main(String[] args) {
        String[] names ={"as", "sdad", "asdasd", "asdasdads", "d"};
        // Using a method reference to print each element
       // Arrays.stream(names).forEach(s-> System.out.println(s.length()));



        int[] numbers = {1,3,5,1,0,4,9,78,2};

        Arrays.stream(numbers).sorted().forEach(System.out::println);

        List<String> names1 = List.of("chandan","Amit","Kaushik","cha");
        names1.stream().filter(n->n.contains("cha")).forEach(System.out::println);

    }
}