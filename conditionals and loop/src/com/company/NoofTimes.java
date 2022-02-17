package com.company;

import java.util.Scanner;

public class NoofTimes {
    public static void main(String[] args) {
//        Scanner in= new Scanner(System.in);
//        int n=in.nextInt() ;

        int n = 22422;

        //To find no of times the value present in a number

        int count=0;
        while (n>0){
            int rem = n % 10;
            if (rem==2){
                count++;
            }
            n=n/10; // n/=10
        }
        System.out.println(count);
    }
}
