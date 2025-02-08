package DataStructure.leetcode;

import java.util.Arrays;

public class LeetCode_1720 {

    public static int[] decode(int[] encoded, int first) {

        int[] value = new int[encoded.length+1];
        value[0] = first;
        for (int i = 1; i <= encoded.length; i++) {

            value[i] = value[i-1] ^ encoded[i-1];
        }
 return value;
    }

    public static void main(String[] args) {

        int[] encoded = {6,2,7,3};
        int first = 4;
        int[] result = decode(encoded, first);

        Arrays.stream(result).forEach(System.out::println);

    }
}
