package com.company;

public class FirstAndLastPosition {
    public static void main(String[] args) {
    }

    //Find First and Last Position of Element in Sorted Array
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};

        //check for first occurance of the target
        ans[0] = search(nums,target,true );
        if (ans[0] !=-1){
            ans[1] = search(nums,target,false );
        }



        return ans;


}
    //this function just returen the index of target
    int search(int[] nums, int target ,boolean findStartIndex ){
        int ans =-1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                if (findStartIndex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }

            }
        }
        return ans;
    }
}


