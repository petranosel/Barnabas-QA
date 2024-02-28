package org.Automation_002;

import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        int number= 3;
       if(number >0) {
           System.out.println("positive");}
       else if (number<0) {
           System.out.println("Negative");}
        else {
           System.out.println("Zero");}

int num=4;
        if (num % 2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");}
//Write a program that determines whether a year (input by the user)
        int year = 2020; // Replace with any year to test
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        //grade student
        int score=85;
        if(score>=90){
            System.out.println("Grade A");}
        else if(score>=80){
            System.out.println("Grade B");}
        else if(score>=70){
            System.out.println("Grade C");}
            else if (score>=60){
                System.out.println("Grade D");}
            else {
            System.out.println("Grade F");}
//age selector
        int age=25;
            if(age<=12){System.out.println("Child");}
        if(age<=19){System.out.println("Teenager");}
        if(age<=64){System.out.println("Adult");}
        else {
            System.out.println("Senior");  }

//switch monday to sunday
        int day = 5; // Replace with a number 1-7
        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day"); break;
        }
        //Basic Calculator: Create a simple calculator that takes two numbers and an
        // operator (+, -, *, /) as input and performs the corresponding operation.
        double num1 = 10; // First number
        double num2 = 5;  // Second number
        char operator = '+'; // Operator: +, -, *, /

        switch(operator) {
            case '+': System.out.println(num1 + num2); break;
            case '-': System.out.println(num1 - num2); break;
            case '*': System.out.println(num1 * num2); break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default: System.out.println("Invalid operator"); break;
        }
//switch month exercise
        int month = 4; // Replace with a number 1-12
        switch(month) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Invalid month"); break;
        }
////Traffic Light Signals: Use switch-case to simulate traffic light signals.
//        // Input R, Y, or G and output "Stop", "Ready", or "Go" respectively.
        char signal = 'R'; // R, Y, G
        switch (signal){
            case 'R':
                System.out.println("Stop"); break;
            case 'Y':
                System.out.println("Ready");break;
            case'G':
                System.out.println("Go");break;
            default:
                System.out.println("Invalid signal");
                break;
        }
        //Write a program where a user inputs a number
        //    // (1-5) and each number corresponds to a different pizza topping
        int toppingChoice = 3; // Replace with a number 1-5
        switch(toppingChoice) {
            case 1: System.out.println("Pepperoni"); break;
            case 2: System.out.println("Mushrooms"); break;
            case 3: System.out.println("Onions"); break;
            case 4: System.out.println("Sausage"); break;
            case 5: System.out.println("Bacon"); break;
            default: System.out.println("Invalid topping choice"); break;
        }










    }}
