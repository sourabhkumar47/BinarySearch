package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        /*
        Variable length Arguments used when we don't know number of inputs to enter
         */
        fun("sfdsg","asdfg","sdfg","dsfg","dfsg","eh");
           multiple(345,345,"Sourabh");
    }
    //Mix of arguments
    static void multiple(int a, int b,String...v){
        System.out.println(Arrays.toString(v));
    }
    //String Argument
    static void fun(String...v){
        System.out.println(Arrays.toString(v));
    }

}
