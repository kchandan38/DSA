package com.datastructure.string;

public class AddStringValue {

    public static void main(String[] args) {

        int[] value = {121,200,101};
       // int[] value = {133,143,251,292};
        int sum = 0;

        for (int i = 0; i <value.length; i++) {
            for (int j = i+1; j <value.length ; j++) {

                    if ((value[i] % 10) == (value[j] % 10) && value[i] / 100 == value[j] / 100)
                        sum = sum + value[i] + value[j];
                }
        }
        System.out.println(sum);
            }
        }