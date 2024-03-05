package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
//        int n = in.nextInt();
//
//        //Check number is Armstrong or not
//        System.out.println(isArm(n));

//        Print all 3 Digit armstrong numbers between some number
        for (int i = 1; i <= 1000000000; i++) {
            if (isArm(i)) {
            System.out.print(i + " ");
            }
        }

//        System.out.print(isArm(153));
    }

    //Check Armstrong
    static boolean isArm(int n) {
        int original=n; //to check is original get equal to last sun or not
        int sum = 0;

        while (n > 0) {
            int rem = n % 10; // Gets last digit
            n = n / 10; //removing last digit for next iteration
            sum = sum+rem * rem * rem;
        }
        return sum == original;
    }

}
