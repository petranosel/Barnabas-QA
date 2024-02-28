package org.Automation_002;


import java.util.Scanner;

public class ifElseconditions {
    public static void main(String[] args) {
        if (10 > 20) {
            System.out.println("10 is not greater than 20");
        } else {
            System.out.println("10 is greater than 20");
        }


        int number = 10;
        if (number > 0) {
            System.out.println("number is is positive");
        } else {
            System.out.println("number is not positive");

        }

        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter name:");


        int age = myScanner.nextInt();
        if (age > 90 && age < 18) {
            System.out.println("you are a child");
        } else if (age > 18 && age < 60) {
            System.out.println("you are an adult");
        } else {
            System.out.println("you are a senior citizen");
        }

        boolean isRainy = true;
        boolean hasUmbrella = false;
        if (isRainy && !hasUmbrella) {
            System.out.println("you might get wet in the rain.");
        } else
            System.out.println("you are prepared for the rain.");
    String favoriteColor = "blue";
                if ("Blue".equals("favorieColor")){
                    System.out.println( "your favorite color is blue.");
                }else {
                    System.out.println("your favorite color is not blue.");
                }






















    }}


