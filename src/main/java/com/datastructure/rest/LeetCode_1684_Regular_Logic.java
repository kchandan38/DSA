package com.datastructure.rest;

//1684. Count the Number of Consistent Strings
public class LeetCode_1684_Regular_Logic {
    public static int countConsistentStrings(String allowed, String[] words) {

        int result = 0;

        for (String word : words) {
            int count = 0;
            char[] w = word.toCharArray();
            for (int i = 0; i < word.length(); i++) {

                if (allowed.contains(String.valueOf(w[i])))
                    count++;
            }
            if (word.length() == count)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {

        String allowed = "cad";
        //String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        String [] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings(allowed, words));
    }
}
