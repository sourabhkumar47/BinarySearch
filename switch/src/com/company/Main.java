package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String days=in.next();
//        String fruit=in.next();

        // Old style Switch-Case

//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("Sweet fruit");
//                break;
//            case "grapes":
//                System.out.println("Small Fruit");
//                break;
//            default:
//                System.out.println("Enter valid value");
//                break;
//        }
        //New style
//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("Sweet fruit");
//                break;
//            case "grapes":
//                System.out.println("Small Fruit");
//                break;
//            default:
//                System.out.println("Enter valid value");
//                break;
//        }

        //Weekdays and weekends
        int days=in.nextInt();
        switch (days) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekends");
            case 6, 7 -> System.out.println("Weekdays");
            default -> System.out.println("Enter number between 1 to 7 only");
        }


    }
}
