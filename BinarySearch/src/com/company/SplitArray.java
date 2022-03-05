package com.company;

public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums,int m){
        int start = 0;
        int end = 0;

        for (int j : nums) {
            start = Math.max(start, j); //in the end of the loop this will contaion the max item from the loop
            end += j;

        }
        //binary search
        while(start < end){
            //try the middle as potential answer
            int mid = start+ (end-start)/2;

            //calculate how many pieces you can divide this in this max sum
            int sum = 0;
            int pices = 1;
            for (int num : nums) {
                if (sum+ num > mid){
                    //you can not add this in this subarray , make a new one
                    //say you add this num in new subarray  , then sum = num
                    sum = num;
                    pices++;
                }else {
                    sum +=num;
                }
            }
            if (pices > m){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end; //here start == end
    }
}
