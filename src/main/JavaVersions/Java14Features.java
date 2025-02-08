package JavaVersions;

import java.awt.*;
import java.util.Locale;

public class Java14Features {

    public record Person(String name, int age) {
        public Person {
            if(age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }
    }

    public static void main(String[] args) {

        String str = """
                Hi
                Hello
                How are you doing?
                """;
        System.out.println(str);

        Point p1 = new Point(10, 20);
        System.out.println(p1.x());         // 10
        System.out.println(p1.y());         // 20

        Point p2 = new Point(11, 22);
        System.out.println(p2.x());         // 11
        System.out.println(p2.y());         // 22

        System.out.println(p1.toString());

        Point p3 = new Point(10, 20);
        System.out.println(p3.x());         // 10
        System.out.println(p3.y());         // 20

        System.out.println(p1.hashCode());  // 330
        System.out.println(p2.hashCode());  // 363
        System.out.println(p3.hashCode());  // 330

        System.out.println(p1.equals(p2));  // false
        System.out.println(p1.equals(p3));  // true
        System.out.println(p2.equals(p3));  // false


            String input = null;
            String result = showUpperCase(input); // NullPointerException
            System.out.println(result);

        }

        public static String showUpperCase(String str){
            return str.toUpperCase(Locale.US);
        }

    }
