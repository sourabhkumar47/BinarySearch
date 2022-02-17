package com.company;

public class OverLoading {
    /*  two functions of same name can exist if they have different
        parameters
     */
    public static void main(String[] args) {

        fun(2);     // If we not give any paramenter it give embigiuity error
        fun("sourabh");

    }
    static void fun(int a){          //both have different argument
        System.out.println(a);       //
    }

    static void fun(String name){
        System.out.println(name);
    }
 }

