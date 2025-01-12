public class DivideByZero {

    static void divide(int a, int b) {

        assert b != 0 : "Division by zero!";
        System.out.println(a / b);
    }


    public static void main(String[] args) {

        divide(2,5);
        divide(4,0);


    }

}