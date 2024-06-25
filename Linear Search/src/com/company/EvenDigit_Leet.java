package com.company;

//
public class EvenDigit_Leet {
    public static void main(String[] args) {
    int[] nums = {12,345,2,6,7896};
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

     //Function to check number is even
     static boolean even(int num) {
     int numberOfDigits=digit(num);
//     if (numberOfDigits % 2 == 0){
//         return true;
//     }
//     return false;
     //optimised way
     return numberOfDigits % 2 ==0;
    }

    //To find no of digits in a number
    static int digit(int num) {
        //it will return count  of number of digits in number

        //To make -ve number +ve
        if (num<0){
            num=num*(-1);
        }

        //if number = 0 then count as 1 digit
        if (num==0){
            return 1;
        }

        //Count the digits
        int count = 0;
        while (num>0){
            count++;
            num=num/10; //num/=10
        }
        return count;
    }

    //optimised way to count digit
    static int digit2(int num) {
        //To make -ve number +ve
        if (num<0){
            num=num*(-1);
        }
        return (int) (Math.log10(num)+1);
    }

}
