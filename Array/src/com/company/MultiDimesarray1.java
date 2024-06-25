package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimesarray1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[][] = new int[3][3];

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = in.nextInt();
//            }
//        }
//
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//
//        ArrayList<Integer> list = new ArrayList<>(10);
//
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//
//        System.out.println(list);

//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//
//        for (int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
//
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                list.get(i).add(in.nextInt());
//            }
//        }
//
//        System.out.println(list);

        int[] arr1 = {1, 2, 3,4, 5,7};

        reverse(arr1);

        System.out.println(Arrays.toString(arr1));


//        System.out.println(max(arr1));

    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;

       while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static int max(int[] arr1){
        int maxVal = arr1[0];
        for (int i = 0; i <arr1.length ; i++) {
            if (arr1[i] > maxVal){
                maxVal =arr1[i];
            }
        }
        return maxVal;
    }

    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }



}
