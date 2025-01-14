/*
* Check Leap Year
•	Objective: Use conditional statements.
•	Problem: Write a program to check whether a given year is a leap year.

* */

import java.util.*;

public class Three{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter Year: ");
        year = sc.nextInt();
        if ((year%4 == 0 && year %100 != 0) || year%400 == 0) {
            System.out.println("Leep Year");
        } else {
            System.out.println("Not leap Year");
        }
    }
}