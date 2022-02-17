package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Declaration
//        int[] ros=new int[5]; //Creating an Array

        //int[] ros    --> Declaration of array ...defined in Stack
        //ros=new int[5] --> Actual memory is created here

        int[] arr = new int[5];
//        arr[0]=45;
//        arr[1]=45;
//        arr[2]=145;
//        arr[3]=435;
//        arr[4]=455;
//        System.out.println(arr[3]);
        //Input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//{ PRINTING }
//        1) Easy method to print
        System.out.println(Arrays.toString(arr));

        // 2) Printing array
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
            }
        System.out.println("");

        // 3) Enhance printing array
        for (int num : arr) {  //for every element in array print the element
            System.out.print(num + " "); //here num represents element of array
             }

//        -------------------------------------------------------
//Array of object


        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();

        }
        System.out.println(Arrays.toString(str));



    }
}
