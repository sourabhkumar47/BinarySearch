package com.company;

import java.util.Arrays;

public class Search_2D_Array {
    public static void main(String[] args) {
    int[][] arr= {
            {45,2},
            {56,23,97},
            {56,4,3,4,54},
            {5,42,53,44,954}
    };

    int target=954;
    int[] ans= search(arr,target);
        System.out.println("Target found at : "+Arrays.toString(ans));
        System.out.println("Maximum : "+max(arr));
        System.out.println("Minimum : "+min(arr));
    }
    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return  new int[]{row, col};
                }
            } 
        }
        return  new int[]{-1, -1};
    }


    //Maximum in 2 d Array
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return  max;
    }

    //Minimum in 2 d Array
    static int min(int[][] arr){
        int min=Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }
        return  min;
    }
}
