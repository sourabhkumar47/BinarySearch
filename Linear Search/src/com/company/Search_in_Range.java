package com.company;

public class Search_in_Range {
    public static void main(String[] args) {
        int[] arr = {46,46,44,674,1,674,14,4,3,4};
        int target = 1;
        System.out.println(search(arr,target,3,10));
    }
    static int search(int[] arr ,int target , int start , int end){
        if (arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}
