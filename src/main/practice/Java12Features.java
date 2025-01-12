import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandles;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class Java12Features {

    public static void main(String[] args) throws FileNotFoundException {

        int num = 3;
        String result = switch(num) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Other";
        };

        System.out.println(result);

        String newWay = " This is a long string " +
                "that spans multiple " +
                "lines in Java code ";

        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.of("HINDI","INDIA"), NumberFormat.Style.SHORT);
        String result1 = fmt.format(1000000);
        System.out.println(result1);

        String str = "The courses\n available \n at javatpoint.";
        System.out.println(str);
        System.out.println(str.indent(4));


        String str1 = "**********\n  Welcome\n  Good Morning\n**********";
        System.out.println(str1.indent(0));
        System.out.println(str1.indent(3));

        String s = "Java,Python,Angular";
        List<String> result2 = s.transform(s1 -> Arrays.asList(s1.split(",")));
        System.out.println(result2);

        String message = "adqw";
        Optional<String> opOfMessage = message.describeConstable();
        System.out.println(opOfMessage);

        String message1 = "Welcome!";
        String constantDesc = message1.resolveConstantDesc(MethodHandles.lookup());
        System.out.println(constantDesc);
    }
}
