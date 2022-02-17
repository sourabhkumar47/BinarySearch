package com.company;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId=in.nextInt();
        String department=in.next();

        switch (empId) {
            case 1 -> System.out.println("Sourabh Kumar");
            case 2 -> System.out.println("Anonymous");
            case 3 -> {
                System.out.println("Emp no 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("No department found");
                }
            }
            default -> System.out.println("Enter correct EmpId");
        }




        }
    }

