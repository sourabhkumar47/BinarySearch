package com.company;

import java.util.Scanner;

public class circumfrence {
    public static void main(String[] args) {
        //calculate Circumference and area

        Scanner in= new Scanner(System.in);
        System.out.print("Enter radius : ");
        int r= in.nextInt();
        System.out.println(cir(r));
        System.out.println(arr(r));


    }
    static int cir(int r){
        int cir;
        cir=2*(22/7)*r;
        return cir;
    }
    static int arr(int r){
        int ar;
        ar=(22/7)*r*r;
        return ar;
    }
}
