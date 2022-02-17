package com.company;

import java.util.Scanner;

public class Subt_the_Pro_and_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Ques:  Subtract the Product and Sum of Digits of an Integer
        /*
        Input: n = 234
        Output: 15
        Explanation:
        Product of digits = 2 * 3 * 4 = 24
        Sum of digits = 2 + 3 + 4 = 9
        Result = 24 - 9 = 15
         */

        int n = 20;
        int sum=0;
        int pro=1;

        while (n>0){
            int rem = n % 10;
            sum=sum+rem;
            pro=pro*rem;
            n=n/10; // n/=10
        }
        System.out.println(sum);
        System.out.println(pro);

        int sub;
        sub=pro-sum;
//        if (pro>sum){
//            sub=pro-sum;}
//        else {
//            sub=sum-pro;}
        System.out.println(sub);
    }
}
