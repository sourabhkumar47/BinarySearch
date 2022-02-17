package com.company;

import java.util.Scanner;

public class smallest_largest {
    public static void main(String[] args) {
        //Maximum and minimum
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 st value : ");
        int a = in.nextInt();
        System.out.println("Enter 2 st value : ");
        int b = in.nextInt();
        System.out.println("Enter 3 st value : ");
        int c = in.nextInt();

//        maxi(a,b,c);
//
//        minm(a,b,c);

        //Method 1
//        if (b>max && b>c){
//            max=b;
//        }
//        else if (c>max){
//            max=c;
//        }
//        System.out.println(max);

        //Method 3
        int max=Math.max(c, Math.max(a,b));
        System.out.println("Maximum is : "+max);

        int min= Math.min(c,Math.max(a,b));
        System.out.println("Minimum is "+ min);
    }

        //Method 3
//        static void maxi(int a,int b,int c) {
//        int max=a;
//        if (a>b && b> c)
//              max=a;
//        else if (b>c)
//                max=b;
//        else
//                max=c;
//            System.out.println(max);
//    }
//
//    //Min
//    static void minm(int a,int b,int c) {
//        int min=a;
//        if (a<b && b< c)
//            min=a;
//        else if (b<c)
//            min=b;
//        else
//            min=c;
//        System.out.println(min);
//    }


 }


