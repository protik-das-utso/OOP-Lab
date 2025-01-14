/*
* Factorial of a Number
•	Objective: Use loops for repetitive calculations.
•	Problem: Write a program to calculate the factorial of a given number.

* */

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int fac = 1;
        for (int i=1; i<=n; i++) {
            fac *=i;
        }
        System.out.println("The Factorial of " +n+ " is: " + fac);
    }
}