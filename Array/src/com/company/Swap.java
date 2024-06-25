package com.company;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        //Here we're swapping values in the array
            int[] arr={24,345,3454,246,54,43};
        //Here 0 and 4 are index that we want to swap
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    //------------------------------------------------
    // reverse using swap
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1; // To get index we subtract 1 (as it give length)
        while (start <   end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

     static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
