package com.company;

public class BinarySearch {

    public static void main(String[] args) {
       int[] arr = {-41 ,-10, -4, 0, 2, 4, 6, 45, 96, 105, 450};
       int target = 6;
       int ans = binarysearch(arr,target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
}
