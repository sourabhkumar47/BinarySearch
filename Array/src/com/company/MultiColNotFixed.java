package com.company;

public class MultiColNotFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 5},
                {7, 5, 3, 7},
                {9, 3, 2, 2, 4}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

    }
}