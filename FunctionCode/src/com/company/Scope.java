package com.company;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
//      System.out.println(num); //Error Because value of num is in function scope only

    }
    static void ramdon(){
        int num=6;
        System.out.println(num);
    }
}
