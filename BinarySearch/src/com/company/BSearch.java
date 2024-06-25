package com.company;

import java.util.Arrays;

public class BSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 5, 6, 7, 9,  17, 9, 28, 37, 56};
        char[] letters = {'a', 'b', 'c', 'd'};

//        System.out.println(ans(arr,9));
//        System.out.println(Arrays.toString(searchRange(arr, 9)));
        System.out.println(BSearch(arr));
//        System.out.println(CeilingNo(arr, 99));
//        System.out.println(nextGreatestLetter(letters, 'd'));
    }

    static int BSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }

    static int CeilingNo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else
                return arr[mid];
        }
        return arr[start];
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }


    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        ans[0] = BSearch2(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = BSearch2(nums, target, false);
        }
        return ans;

    }

    static int BSearch2(int[] nums, int target, boolean searchingStart) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (searchingStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    static int ans(int[] arr, int target) {
        int start = 0;

        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1); //end = end * 2 end //if initially 2 block it will cover 4 block
            start = temp;
        }

        return BsearchAns(arr, target, start, end);

    }

    static int BsearchAns(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
