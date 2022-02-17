package com.company;

public class Max_Val {
    public static void main(String[] args) {
        int [] arr = {456,464,10,41,6,65,354,3,4};
        System.out.println(min(arr));
    }

    //Finding minimum in the array
    //Assume array is !=0
    static int min(int[] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    }

