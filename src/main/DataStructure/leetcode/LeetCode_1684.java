package DataStructure.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

//1684. Count the Number of Consistent Strings
public class LeetCode_1684 {
    public static int countConsistentStrings(String allowed, String[] words) {

        int result = 0;
        char[] all = allowed.toCharArray();

        for (String word : words) {
            int count = 0;
            char[] w = word.toCharArray();
            for (int i = 0; i < word.length(); i++) {

                for (int j = 0; j < allowed.length(); j++) {
                    if ((w[i]^all[j])==0)
                        count++;
                }
            }
            if (word.length() == count)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {

        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        //String [] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings(allowed, words));
    }
}
