package DataStructure.rest;

public class Solution {
    public static int numberOfSteps(int num) {

        int count = 0;
        while(num!=0){

            if(num % 2 ==0){
                num = num>>1;
            }
            else{
              num = num - 1;
            }
            count = count +1;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(Solution.numberOfSteps(123));
    }
}