import java.util.List;
import java.util.stream.Collectors;

public class OrElseThrow {

    public static void main(String[] args) {

        var data = List.of(1,3,2,9,7,11,3);

        List<Integer> dataList = new java.util.ArrayList<>(data.stream().toList());

        dataList.add(12);

        Integer value = data.stream().filter(n->n%2==0).findFirst().orElseThrow();

        System.out.println(value);


    }
}
