package com.company;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int a= in.nextInt();
        int b= in.nextInt();

        System.out.println(prod(a,b));

    }
    static int prod(int a,int b){
        int c;
        c= a*b;
        return c;
    }
}
