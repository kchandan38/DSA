package DataStructure.loopsandnumbers;

// 8. WAP to Find whether given Number is Prime or Not.
public class Lab8 {

    public static void main(String[] args) {

        int num = 35;
        int count = 0;
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0) {
                count++;
                break;
            }
        }
        if(count==0)
            System.out.println("Prime");
        else
            System.out.println("Not a prime");
    }
}
