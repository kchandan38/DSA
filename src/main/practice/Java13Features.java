import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public class Java13Features {


    private static String validateData(String data){

        return switch (data.toUpperCase(Locale.ROOT)){
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Invalid";
        };
    }

    public static void main(String[] args) {

        System.out.println(validateData("Monday"));


        AtomicReference<String> stringtextBlock = new AtomicReference<>("""  
                This JEP has improved ZGC by allowing 
                the operating system to recover wasted heap memory. 
                In Java 11, the Z Garbage Collector was introduced. 
                It introduces a little wait before the heap memory cleanup. However, 
                the operating system did not receive the unused RAM.
                This was an issue for IoT and microchip devices with small memory footprints. 
                It has now been improved so that unneeded memory is returned to the operating system.""");
      //  String stringLiteral = "Hi\nHello\nYes";
      //  System.out.println("Text Block String:\n" + stringtextBlock);
      //  System.out.println("Normal String Literal:\n" + stringLiteral);

    }


}
