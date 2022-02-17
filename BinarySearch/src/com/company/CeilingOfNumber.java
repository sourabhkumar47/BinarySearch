package com.company;

public class CeilingOfNumber {
    public static void main(String[] args) {
        //Ceiling basically means -> the smallest number in array
        // ,that is greater or equal to target
        //it's simple binary search until no not found
        //if not found simply return start when while loop is broken
        //eg arr=[1 ,2 ,5 ,6 ,8 ,9]
        //so cieling of 5 is 5
        //so cieling of 4 is 5
        //so cieling of 7 is 8

        int[] arr = {-41 ,-10, -4, 0, 2, 4, 6, 45, 96, 105, 450};
        int target =56;
        int ans = CelilingOfNumber(arr,target);
        System.out.println(ans);
    }
    //return the element of smallest no >=target
    static int CelilingOfNumber(int[] arr, int target) {
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
                return arr[mid];
            }
        }
        //Return when element not found
        return arr[start]; //When the while loop break it return start
    }



}
