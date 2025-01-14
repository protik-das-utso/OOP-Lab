/*
* Grade Calculator
•	Objective: Practice conditional statements and user input.
•	Problem: Write a program to take a student's marks as input and display the corresponding grade based on the following scale:
o	Marks >= 90: Grade A
o	Marks >= 80: Grade B
o	Marks >= 70: Grade C
o	Marks >= 60: Grade D
o	Marks < 60: Grade F

* */

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num >= 90) {
            System.out.println("Grade: A");
        } else if (num >= 80) {
            System.out.println("Grade: B");
        } else if (num >= 70) {
            System.out.println("Grade: C");
        } else if (num >= 60) {
            System.out.println("Grade: D");
        } else if (num >= 50) {
            System.out.println("Grade: F");
        }
    }
}
