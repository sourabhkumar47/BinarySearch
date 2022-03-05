package com.company;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
    int pivot = findPivot(arr);
    return pivot+1;
    }

    //For not duplicates
    static  int findPivot(int[] arr ){
        int start =0;
        int end=arr.length-1;
        while (start <= end){
            int mid = end + (start - end)/2;
            //There is 4 cases :
            if (mid < end /* if mid is last element then mid+1 will give error */&& arr[mid] > arr[mid+1]){
                return mid;
            }if (mid > start /* if mid is last element then-mid+1 will give error */&& arr[mid] < arr[mid-1]){
                return mid-1;
            }if (arr[mid] <= arr[start]){
                end = mid-1;
            }if (arr[mid] >= arr[start]){
                start = mid+1;
            }
        }
        return -1;
    }

//For duplicate numbers

    static int findPivotwithduplicate(int[] arr ){
        int start =0;
        int end=arr.length-1;
        while (start <= end){
            int mid = end + (start - end)/2;
            //There is 4 cases :
            if (mid < end /* if mid is last element then mid+1 will give error */&& arr[mid] > arr[mid+1]){
                return mid;
            }if (mid > start /* if mid is last element then-mid+1 will give error */&& arr[mid] < arr[mid-1]){
                return mid-1;
            }
            // if elements at middle , start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates

                //NOTE: what if these elements were the pivots??
                //check if start is pivot
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;

                //check weather end is pivot
                if (arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted , so pivot is in right side
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start=mid+1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }
}
