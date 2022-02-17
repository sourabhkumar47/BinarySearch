package com.company;

public class Shadowing {
    static int x=90;//This will be shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x); //Print 90
        int x;
        x=10; //local Scope
        System.out.println(x); //print 10
        //Lower level is overlapping the upper level
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
