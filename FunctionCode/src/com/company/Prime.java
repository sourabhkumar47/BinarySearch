package com.company;

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isPrime(n));

    }
    static boolean isPrime(int n){
        if (n<=1){
            return true;
        }
        else if (n==2)
        return false;
        else if (n%2==0){
            return false;
        }
        for (int i = 3; i <=Math.sqrt(n) ; i+=2) {
            if (n%i==0)
                return false;
        }
        return true;
    }
}
