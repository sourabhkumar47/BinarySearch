package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //When we don't know size of array we us array list
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(75); //To add items on list
//        list.add(475);
//        list.add(73465);
//        list.add(7875);
//        list.add(39675);
//
//        System.out.println(list);
//        list.set(0,5); //To update any no --> 0 is index and 5 is value
//        list.remove(2);  // To remove any index
//        System.out.println(list);

        //Input
        for (int i = 0; i <5; i++) {
            list.add(in.nextInt());
        }

        //Printing
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)); //Pass index here .list[index] will not work here

        }
    }
}
