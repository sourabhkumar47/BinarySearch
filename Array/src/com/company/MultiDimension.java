package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
           1 2 3
           4 6 7
           7 4 2
         */
        //int[][] arr=  new int[3][];   //Rows is mandatory but
                                      // columns are not
             //Because row tell us no of array should be there
             //But we not define no of element store in particular array

//        int[][] arr={
//                {1 ,2 ,3}, //0th index
//                {4 ,5 ,6}, //1st index
//                {7 ,8 ,9} //2nd index
//        };

        //Inserting values
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for (int row = 0; row <arr.length ; row++) {
            //for each col in each column
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
        }
        
        //Printing
//        for (int row = 0; row <arr.length ; row++) {
//            //for each col in each column
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
        //Second way
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
