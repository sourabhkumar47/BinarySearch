package com.company;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArrayQuestion {
    public static void main(String[] args) {

        int[] arr={ 3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target) {
        //First find the range
        //First start with box of 2
        int start = 0;
        int end = 1;

        //Condition of the target to lie in range
        while (target > arr[end]) {
            int newStart = end + 1;

            //now to find end
            //Double the box
            //so newEnd = previousEnd + 2*BoxSize
            //BoxSize = end-start+1
            end = end + (end - start + 1) * 2;
            start = newStart;

        }
        return binarysearch(arr, target, start, end);

    }
    static int binarysearch(int[] arr, int target ,int start ,int end) {


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //Ans
                return mid;
            }
        }

        return -1;
    }
}
