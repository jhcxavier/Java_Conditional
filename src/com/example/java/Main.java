package com.example.java;
//import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        double result = addValues(s1, s2);
        System.out.println("The result is: "+ result);

        double result2 = addValues(s1,s1,s1,s2);
        System.out.println("The answer for multiple values is: " + result2);
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
// *The first time I'm calling this method because there are two arguments
    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

//So now I have two different methods, both called addValues,
// and which one is called will be based on how many values I pass in when I call it.
//    *The second time I'm calling this method because there are multiple values
    private static double addValues(String... values) {
       double result = 0;
        for (String str:
             values) {
            double d = Double.parseDouble(str);
            result += d;
        }
        return result;
    }
//     You can distinguish between the methods either by the quantity of the arguments,
//     or by the types. And Java's compiler and runtime are smart enough to figure out
//     which of the methods you're intending to call.


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
//    private static final String[] months = {
//        "January", "February", "March", "April",
//        "May", "June", "July", "August", "September",
//        "October", "November", "December"
//
//    };
//    public static void main(String[] args){
//        for loop
//        To make this code reusable I'll extract that code to a new method.
//        IntelliJ IDEA has tools that let you do this easily. It's a process called refactor.
//        loopMonths();

//         So this is a reasonable bit of code that does some really good work for me.
//         It loops through the list of months, matches the value that was passed in, and if found,
//         returns the equivalent number or returns a value of minus one if that number isn't found.

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("Enter a month: ");
//            String monthNAme = scanner.nextLine();
//            if(monthNAme.length() == 0){
//                break;
//            }
//            int monthNumber = getMonthNumber(monthNAme);
//            if (monthNumber == -1) {
//                System.out.println("Month not found");
//            } else {
//                System.out.println(String.format(
//                        "%s is month number %d", monthNAme, monthNumber + 1
//                ));
//            }
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
//        int counter = 0;
//        do {
//            System.out.println(months[counter]);
//         counter ++;
//         if(counter == 5){
//             break;
//         }
//        }while(counter < months.length);

//    }

//    private static void loopMonths() {
//        for (int i = 0; i <months.length ; i++) {
//            System.out.println(months[i]);
//        }
//    }
//    private static int getMonthNumber(String monthName) {
//        for (int i = 0; i <months.length ; i++) {
//            if (monthName.equalsIgnoreCase(months[i])) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
