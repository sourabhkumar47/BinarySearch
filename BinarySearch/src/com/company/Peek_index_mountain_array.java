package com.company;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Peek_index_mountain_array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 8, 15, 4, 3, 2, 1};

    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(MountainArray);
        int firstTry = binarysearch(MountainArray,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }else{
            return binarysearch(MountainArray,target,peak,arr.leanght-1);
        }
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in decreasing part
                //this may be the answer , but look at left
                //this is why end !=mid-1
                end = mid;
            } else {
                //we are in ascending part
                //this might be the answer , but look at right
                start = mid + 1; //because we know that mid+1 > mid
            }
        }
        //in the last end ,start == end and pointing number because of the 2 checks above
        //start and end are always trying to find max element in above 2 checks
        //hence, when they are pointing to just one element , that is the max no because that is what the check say
        //More elobrate:at every point of time for start and end , they have the best possible till that time
        //and if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer
        return start; //or end as both are same
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
}
