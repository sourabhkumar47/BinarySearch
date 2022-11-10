package com.company;

public class Max_Min_of_3_no {
    public static void main(String[] args) {

        int maxAns = max(2, 8, 7,5);
        int minAns = min(2, 5, 7);
        System.out.println("max is " + maxAns);
        System.out.println("min is " + minAns);
    }

    //to find max
    static int max(int a, int b, int c, int d) {

        int max = a;

        if (b > max && b>c && b>d) {
            max = b;
        }
        if (c > max && c> d) {
            max = c;
        }
        if (d > max ) {
            max = d;
        }

        return max;
    }

    static int min(int a, int b, int c) {

        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        return min;
    }
}
