package DataStructure.leetcode;


import java.util.Arrays;
import java.util.List;

//2859. Sum of Values at Indices With K Set Bits
public class LeetCode_2859 {


    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int  countSet = 0;
            int n = i;
            while(n > 0){
                if((n & 1) != 0)
                    countSet++;
                n = n >> 1;
            }

            if (countSet == k) {
                sum = sum + nums.get(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5,10,1,5,2);
        int k = 1;
        System.out.println(sumIndicesWithKSetBits(nums, k));

    }
}
