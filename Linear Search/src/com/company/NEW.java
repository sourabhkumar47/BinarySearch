package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NEW {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int[][] arr = {
                {1, 54, 645, 3, 5},
                {748,54,874,45,45},
                {87,46,64,4},
        };

        System.out.println(max2DArray(arr));

//        int[] ans = search2DArray(arr,4);
//        System.out.println(Arrays.toString(ans));

//        System.out.println(linerSearch(arr, 645));
//        System.out.println(searchInString("xdfghfdbhj", '3'));
//        sumOfString("35fsgd");
//        System.out.println(minNumber(arr));
//        System.out.println(maxNumber(arr));
    }

    static int linerSearch(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]) {
                return index;
            }
        }
        return -1;
    }

    static int searchInString(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(i);
            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    static void sumOfString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
//            System.out.print (i );
//            System.out.println();
            sum = sum +i;
        }
        System.out.print(sum);
    }

//    int[] arr = { 54, 645, 3, 5,1};

    static int minNumber(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min =arr[i];
            }
        }
        return min;
    }

    static int maxNumber(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
    static int[] search2DArray(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length ; column++) {
                if (arr[row][column] == target){
                    return new int[]{row , column};
                }
            }
        }
        return new int[]{-1, 1};
    }

    static int max2DArray(int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                        max = arr[row][col];
                }
            }
        }
        return max;
    }


}
