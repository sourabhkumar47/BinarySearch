package com.company;

public class Floor {
    public static void main(String[] args) {
        //It's opposite of Celing of Number
        //Floor basically means -> the Greatest number in array
        // ,that is smallest or equal to target
        //it's simple binary search until no not found
        //if not found simply return end when while loop is broken
        //eg arr=[1 ,2 ,5 ,6 ,8 ,9]
        //so Floor of 5 is 5
        //so Floor of 4 is 5
        //so Floor of 7 is 6

        int[] arr = {-41 ,-10, -4, 0, 2, 4, 6, 45, 96, 105, 450};
        int target =56;
        int ans = FloorOfNumber(arr,target);
        System.out.println(ans);
    }
    //return the element of the greatest no >=target
    static int FloorOfNumber(int[] arr, int target) {
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
        return arr[end]; //When the while loop break it return end as it is the greatest among smallest number
    }
}

