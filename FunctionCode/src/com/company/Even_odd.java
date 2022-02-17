package com.company;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        //Even or odd
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a= in.nextInt();

        if (a%2==0){
            System.out.println("Even");
        }
        else
            System.out.println("Odd");

    }
}
