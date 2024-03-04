package com.company;

import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        //prime or not
        /* Algorithm
        start
        input n
        if(n<=1)
            print("Neither prime or not")
        c=2;
        while(c*c<=n)
            if(n%c==0)
                print("Not Prime")
                exit
            c=c+1;
        end while
        output "Prime"
        exit
         */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isPrime(n));


    }
//        int c= 2;
//    static boolean isPrime(int n){
//        if (n<=1)
//            return false;
//        else if (n==2)
//            return true;

    static Boolean isPrime(int n){
        if(n<=1)
            return true;
        int c = 2;
        while (c*c <= n){
            if (n%c==0)
                return false;
            c++;
        }
        return true;
    }
}


