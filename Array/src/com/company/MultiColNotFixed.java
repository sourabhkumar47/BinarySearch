package com.company;

import java.util.Scanner;

public class MultiColNotFixed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr2 = {
                {2, 4, 5},
                {7, 5, 3, 7},
                {9, 3, 2, 2, 4}
        };


//        for (int row = 0; row < arr2.length; row++) {
//            for (int col = 0; col < arr2[row].length; col++) {
//                System.out.print(arr2[row][col]+" ");
//            }
//            System.out.println();
//        }

        int[][] arr = new int[3][4];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}