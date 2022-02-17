package com.company;

public class swap {
    public static void main(String[] args) {

//        {   // Here the value of a abd b not swapped when it comes out of scope
            // And the value of num1 and num2 is changes but values of a and b
            //remains same
            //So the swap function not working outside
//            int a = 10;
//        int b=20;
//        swap(a,b);
//        System.out.println("External : a = "+a+" "+"b = "+b);
//        }
//        int temp=a;
//        a=b;
//        b=temp;

//        System.out.println(a+" "+b);

//        swap(a,b);
//        System.out.println(a+""+b);

        String name="sourabh kumar";
        chagename(name);
        System.out.println(name);
    }

    static void swap(int a, int b){
        int temp=a ;
        a=b;
        b=temp;
        System.out.println("Internal: a = "+a+" "+"b = "+b);
    }

    static void chagename(String name) {
        name="Rohit";
    }
//    static void swap(int num1, int num2){
//        int temp=num1;
//        num1=num2;
//        num2=temp;
    }

