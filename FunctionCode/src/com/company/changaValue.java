package com.company;
import java.util.Arrays;

public class changaValue {
    public static void main(String[] args) {
        //Array
        int[] arr={545,11,46,16,3,46,1,364,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0]=45; //Original value of array will change as it is referring to same object
                   //but in greeting it was creating different object so there values are not
                   //changedS
    }
}
