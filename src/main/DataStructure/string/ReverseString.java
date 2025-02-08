package DataStructure.string;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Vishnu Chandan";
        char[] name = str.toCharArray();
        for (int i = name.length-1; i >=0 ; i--) {
            System.out.print(name[i] + " ");
        }
    }
}