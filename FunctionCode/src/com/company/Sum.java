package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum(); //This function will run
    }
    //Sum Function
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter number 1 : ");
        num1=in.nextInt();
        System.out.print("Enter number 2 : ");
        num2=in.nextInt();

        sum=num1+num2;
        System.out.println("Sum of two no is : "+sum);
    }
}
