package com.company;

public class Max {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,0,0};

        System.out.println(max(arr));
//        System.out.println(maxRan(arr,2,5));
    }

    static int max(int[] arr) {
        if (arr == null) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }
        return maxVal;
    }

    //Fnd max between range
    static int maxRan(int[] arr,int start, int end) {
        if (arr == null) {
            return -1;
        }
        if (end > start) {
            return -1;
        }
        int maxRan = arr[0];
        for (int i = start; i <= end ; i++) {
            if (arr[i] > maxRan) {
                maxRan = arr[i];
            }

        }
        return maxRan;
    }
}
