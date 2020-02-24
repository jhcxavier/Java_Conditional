package com.example.java;
//import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//
////        If / else
//        int monthNumber = 6;
//
//        if (monthNumber >= 0 && monthNumber <= 2){
//            System.out.println("It's the first Quarter");
//        } else if (monthNumber >= 3 && monthNumber <= 5) {
//            System.out.println("It's the second Quarter");
//        } else {
//            System.out.println("You are in the second half of the year");
//        }
//
////        Switch Statement
//        int month = 0;
//
//        switch (month) {
//            case 0:
//                System.out.println("It's January");
//                break;
//            case 1:
//                System.out.println("It's February");
//                break;
//            case 2:
//                System.out.println("It's March");
//                break;
//            default:
//                System.out.println("It's some other month");
//        }
//
//        String monthName = "January";
//        switch (monthName){
//            case "January":
//                System.out.println("It's the first month");
//                break;
//
//            default:
//                System.out.println("It isn't January");
//        }
//}
    private static final String[] months = {
        "January", "February", "March", "April",
        "May", "June", "July", "August", "September",
        "October", "November", "December"

    };
    public static void main(String[] args){
//        for loop

//        for (int i = 0; i <months.length ; i++) {
//            System.out.println(months[i]);
//        }

//        foreach loop

//        for (String month:
//             months) {
//            System.out.println(month);
//        }

//        while loop
//        int counter = 0;
//        while(counter < months.length){
//            System.out.println(months[counter]);
//            counter ++;
//        }

//        do while loop
        int counter = 0;
        do {
            System.out.println(months[counter]);
         counter ++;
         if(counter == 5){
             break;
         }
        }while(counter < months.length);

    }
}
