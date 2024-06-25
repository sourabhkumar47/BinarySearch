package com.company;

public class EvenDigitCount2 {
    public static void main(String[] args) {

        int [] arr = {466,35,434,34,34,64,37,23,64};

        System.out.println(findNumber(arr));

//        System.out.println(noOfEven(arr));

//        System.out.println(noOfDigit(63653));
//        System.out.println(isEven(0));


    }
    static int findNumber(int[] arr){
        int ans=0;

        for(int i=0;i<arr.length;i++){
            int count=0;
            while(arr[i]>0){
                count++;
                arr[i]/=10;
            }
            if(count%2==0) ans++;
        }
        return ans;
    }

    static int noOfEven(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int nums  = arr[i];
            if (isEven(nums)){
                count++;
            }
        }
        return count;
    }



    static boolean isEven(int number) {
        int noOfDigit = noOfDigit(number);
        return noOfDigit % 2 == 0;
    }

    static int noOfDigit(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}



class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i =0;i< nums.length;i++){
            int n = nums[i];
            if(isEven(n)){
                count++;
            }
        }
        return count;

    }

    private boolean isEven(int num){
        int number = noOfDigit(num);

        return number % 2 ==0;
    }

    private int noOfDigit(int num){
        return (int)Math.log10(num) + 1;
    }
}
