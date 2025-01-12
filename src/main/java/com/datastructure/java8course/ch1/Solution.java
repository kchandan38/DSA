package com.datastructure.java8course.ch1;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        // Complete the function
        
        StringBuffer array1 = new StringBuffer(a.toLowerCase());
        StringBuffer array2 = new StringBuffer(b.toLowerCase());
        
        if(array1.equals(array2))
            return true;
        else if(array1.reverse().equals(array2))
            return true;
        else if(array1.equals(array2.reverse()))
            return true;   
        else
            return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}