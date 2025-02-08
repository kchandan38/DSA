package DataStructure.leetcode;

//1486. XOR Operation in an Array
public class LeetCode_1486 {

    public static int xorOperation(int n, int start) {

        int number = start;
        int[] num = new int[n];
        for (int i = 1; i <n; i++) {
            num[i] = start + 2 * i;
            number = number ^ num[i];
        }
    return number;
    }

    public static void main(String[] args) {

        System.out.println(xorOperation(5,0));
    }
}
