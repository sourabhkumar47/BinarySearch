package com.company;

//https://leetcode.com/problems/search-in-rotated-sorted-array/

//Pivot = the largest number in the array

public class RotatedBinarySearch {
    public static void main(String[] args) {
    int[] arr = {4, 5, 6, 7, 0, 1, 2};
    }

    public int search(int[] nums,int target){
        int pivot = findPivot(nums);

        //if you did not find the pivot it means array is not rotated
        //so do normal BS
        if (pivot == -1){
            //just do normal BS
            return binarysearch(nums,target,0,nums.length-1);
        }

        //if pivot is found , you have to found 2 asc Sorted array
        if (nums[pivot] ==target ){
            return pivot;
        }if (target >= nums[0] ){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarysearch(int[] arr, int target,int start,int end) {


        while (start <= end) {
            //Find middle element

            //int mid=(start + end)/2; //Here is an error
            //Might be ( start+end ) > int range , so it give error to fix
            int mid = start + (end - start) / 2; //to get solve equation, it is same as above

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //Ans
                return mid;
            }
        }
        //Return when element not found
        return -1;
    }


     int findPivot(int[] arr ){
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
}
