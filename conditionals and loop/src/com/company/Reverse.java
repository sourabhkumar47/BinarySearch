package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        int n=in.nextInt() ;

        int n = 18141;
        // To find reverse of a number

        int rev=0;
        while (n>0){
            int rem = n % 10;
            rev=rev*10+rem;
            n=n/10; // n/=10
        }
        System.out.println(rev);
    }
}
