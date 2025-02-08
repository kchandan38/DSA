package DataStructure.sorting;

import java.util.Arrays;

// Bubble Sort Example in optimized way
public class Lab12 {
    
    public static void main(String[] args) {

        int[] data = {15,2,5,20,6,9,0,28};
        int len = data.length;

        for (int i = 0; i < len; i++) {

            boolean swaped = false;
            for (int j = 0; j < len-i-1; j++) {

                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    swaped = true;

                }
            }
            if(!swaped)
                break;
        }
        Arrays.stream(data).forEach(System.out::println);
    }
}
