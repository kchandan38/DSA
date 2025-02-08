package DataStructure.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSorting {

    private static int[] InsertionSort(int[] intArr){


        int len = intArr.length;

        for (int i = 1; i <=len-1; i++) {

            int key = intArr[i];
            int j = i-1;
            while(j>=0 && intArr[j]>key){

                intArr[j+1] = intArr[j];
                j--;
            }
            intArr[j+1] = key;

            }

        return intArr;
    }

    public static void main(String[] args) {

        int[] list = new int[]{12,3,53,12,1,2,43,32,87,9,6,57};

        int[] sortedList = InsertionSort(list);

        for (int i : sortedList) {
            System.out.println(i);
        }
    }
}
