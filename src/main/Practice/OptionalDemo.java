import java.util.Arrays;
import java.util.Optional;

// Driver Class
public class OptionalDemo {
      // Main Method
    public static void main(String[] args)
    {
        String[] words = new String[10];
        words[0] = "chandan";
        words[5] = "swati";

        System.out.println(Arrays.toString(words));
          Optional<String> checkNull = Optional.ofNullable(words[5]);
        
          if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }
}