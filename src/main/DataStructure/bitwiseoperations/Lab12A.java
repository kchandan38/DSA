package DataStructure.bitwiseoperations;

//Count the number of Set Bits in given number.
//Brain Kerningam's Algorithm
public class Lab12A {

    public static void main(String[] args) {

        int n = 15;
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println("No of set bit(s): " + count);
    }
}
