package org.Automation_002;

import jdk.jshell.Snippet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class meda
{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter the student name :");
        String name = myScanner.nextLine();

        System.out.println(" enter math score:");
        int math = myScanner.nextInt();

        System.out.println("enter science score :");
        int science = myScanner.nextInt();

        System.out.println("enter english score:");
        int english = myScanner.nextInt();

        // check average
        int average = (math + english + science) / 3;
        //System.out.println("average score:"+ average);

        String Status = (average >= 60 && math >= 50 & science >= 50 && english >= 50) ? "passed" : "failed";

//getting out put
        System.out.println("Student Name: " + name);
        System.out.println("Average score: " + average);
        System.out.println("Grade: " + Grade(average));
        System.out.println("Status: " + Status);
    }
    //grade
        public static String Grade(int average)
        {
        if (average >= 90) {
            return "A";
        }
        if (average >= 80) {
            return "B";
        }  if (average >= 70 ) {
            return "C";
        }  if (average >= 60) {
            return "D";
        } else {
            return "fail";







        }






    }
}
