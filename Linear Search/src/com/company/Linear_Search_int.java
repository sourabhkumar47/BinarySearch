package com.company;

public class Linear_Search_int {

    public static void main(String[] args) {
	    //Find element in the array
        int[] arr = {4,5,78,1,4,24,1,4,5,2,23};
        int target =23;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    //Search in the array : and return the index if found
    //Otherwise ,if not found return -1

    //it will return index
    static int linearSearch(int[] arr, int targt){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element==targt){
                return index;
            }
        }
        //this line will execute when nun of the return statement is executed
        //hence target not found
        return -1;
    }


    //it will return Element itself
    static int linearSearch2(int[] arr, int targt){
        if (arr.length==0){
            return -1;
        }
        for (int element : arr) {
            if (element == targt) {
                return element;
            }
        }
        //this line will execute when nun of the return statement is executed
        //hence target not found
        return -1;
    }

    //it will return TRUE or FALSE
    static boolean linearSearch3(int[] arr, int targt){
        if (arr.length==0){
            return false;
        }
        for (int element : arr) {
            if (element == targt) {
                return true;
            }
        }
        //this line will execute when nun of the return statement is executed
        //hence target not found
        return false;
    }
}
