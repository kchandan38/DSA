package DataStructure.bitwiseoperations;

public class Lab4 {
    public static void main(String[] args) {
        int p = 5;
        System.out.println(p ^ p); //0
        System.out.println(p ^ 0); //p
        System.out.println(0 ^ p); //p
        int a = 9;
        int b = 13;
        int c = 25;
        int x = a ^ b;
        int y = b ^ a;
        System.out.println(x);
        System.out.println(y);
        x = (a ^ b) ^ c;
        y = a ^ (b ^ c);
        System.out.println(x);
        System.out.println(y);
    }
}