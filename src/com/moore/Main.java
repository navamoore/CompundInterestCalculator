package com.moore;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        double amount;
//        double principal = 60000;
//        double rate =.03;
//
//        for (int year=1; year<=10; year++){
//            amount=principal*Math.pow(1+rate, year);
//            System.out.println(year + "  " + amount);
//        }
//    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principal = 0;
        double rate = 0;
        double time = 0;

        double amount = 0;

        System.out.print("Enter the Principal amount : ");
        principal = input.nextDouble();

        System.out.print("Enter the Rate : ");
        rate = input.nextDouble();

        System.out.print("Enter the Time : ");
        time = input.nextDouble();

        for (int i = 1; i <= time; i++) {
            amount = principal * Math.pow(1 + rate, i);
            System.out.println("");
            System.out.println("The Compound Interest for year " + i + " is : " + amount);
        }

    }

}

