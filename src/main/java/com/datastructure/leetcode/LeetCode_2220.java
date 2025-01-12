package com.datastructure.leetcode;

public class LeetCode_2220 {

    public static int minBitFlips(int start, int goal) {

        // 0011 -> 0000
        // 1) 0010
        // 2) 0000
    String strt = Integer.toBinaryString(start);
    String gol  = Integer.toBinaryString(goal);

    char[] a = strt.toCharArray();

        System.out.println(a);

      return 0;
    }
    public static void main(String[] args) {

      // System.out.println(minBitFlips(3,2));
        System.out.println(10^7);
      //  System.out.println(1|0);

    }
}
