import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class UnmodifiableListExample {

    public static void main(String[] args) {

        List<String> originalList = Arrays.asList("a", "b", "c");

        List<String> unmodifiableList = Collections.unmodifiableList(originalList);

        // This will throw an UnsupportedOperationException
        //unmodifiableList.add("d");

        // However, modifying the original list will still affect the unmodifiable view
        originalList.set(0, "x");
        originalList.add("d");
        System.out.println(originalList);


        List<String> originalList1 = List.of("a", "b", "c");
       // originalList1.add("d");
       // originalList1.set(1,"d");

        System.out.println(originalList1);

        String[] name = new String[10];
        name[0] = "Chandan";


        Optional<String[]> data = Optional.of(name);

        if(data.isPresent()){

        }else{

        }
    }
}
