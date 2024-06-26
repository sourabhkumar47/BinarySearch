package com.company;

public class OrderAgnosticBS {
   public static void main(String[] args) {
        int[] arr = {0, 2, 4, 5, 45, 96, 105, 450};
        int[] arr2 ={450,150,80,60,50,45,30,10,5};
        int target = 45;
//        int ans=orderAgnosticBS(arr,target);
        int ans2=orderAgnosticBS(arr2,target);
//        System.out.println(ans);
        System.out.println(ans2);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        //Find weather arr is ascending or descending
        //Return true or false , true for asc and false for dec
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //Find middle element

            //int mid=(start + end)/2; //Here is an error
            //Might be ( start+end ) > int range , so it give error to fix
            int mid = start + (end - start) / 2; //to get solve equation, it is same as above

            if(arr[mid] == target)
                return mid;

            if (isAsc) {
                if (target < arr[mid]){
                    end = mid-1;
                }
                else{
                start = mid + 1;
            }}
            else {
                if (target > arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        //Return when element not found
        return -1;
    }
}

