package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not enter X or x

        int ans=0;
        while(true){
                    //Take operator
            System.out.println("Enter operator");
            char op=in.next().trim().charAt(0);

            if (op=='+' || op=='-'|| op=='*' || op=='/' || op=='%') {

                // Take input of numbers

                System.out.println("Enter First number :");
                int num1 = in.nextInt();
                System.out.println("Enter Second number :");
                int num2 = in.nextInt();
                //check for operator
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    //if denominator becomes 0 it is not define
                    if (num2 != 0)
                        ans = num1 / num2;}
                if (op == '%') {
                        ans = num1 % num2;
                    }
                }else if (op=='X' || op=='x') {
                break;
            }else {
                System.out.println("Invalid operation !!");
            }
            System.out.println(ans);
        }
    }
}
