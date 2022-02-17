package com.company;

import java.util.Scanner;

public class GreatestAmong3 {
    public static void main(String[] args) {

        //Find the largest among 3
        Scanner in= new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

    //Method 1

//        int max=a;
//        if (b>max && b>c){
//         max=b;
//        }
//        else if (c>max){
//            max=c;
//        }
//        System.out.println(max);

    //Method 2

        if (a>b && a>c)
            System.out.println(a);
        else if (b>a && b>c)
            System.out.println(b);
        else
            System.out.println(c);

    //Method 3

    int max=Math.max(c,Math.max(a,b));
        System.out.println(max);

    }
}
