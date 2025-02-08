import java.util.Set;
import java.util.TreeSet;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int len=1;
        int j=0;
        int i =1;
        int stringLen = s.length();
        Set<Character> d = new TreeSet<>();
        while(stringLen<i){
            if(s.charAt(j)!=s.charAt(i)){
                if(d.add(s.charAt(i)))
                    len++;
                else {
                    j++;
                    i = j+1;
                }
            }

        }
     return len;   
    }

    public static void main(String[] args) {

        System.out.println(Solution.lengthOfLongestSubstring("pwwkew"));

    }
}