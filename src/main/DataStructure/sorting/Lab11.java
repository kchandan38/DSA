package DataStructure.sorting;

import java.util.Arrays;

// Bubble Sort Example
public class Lab11 {
    
    public static void main(String[] args) {

        int[] data = {15,2,5,20,6,9,0,28};
        int len = data.length;
        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len-i-1; j++) {

                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        Arrays.stream(data).forEach(System.out::println);
    }
}
