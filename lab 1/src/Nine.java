/*
* . Armstrong Number Checker
•	Objective: Use loops and digit manipulation.
•	Problem: Write a program to check whether a given number is an Armstrong number (e.g., 153 = 13+53+331^3 + 5^3 + 3^313+53+33).

* */

import java.util.Scanner;

import static java.lang.Math.pow;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int sum = 0, m = 0;
        while (n > 0) {
            m = n%10;
            sum += pow(m, 3);
            n = n/10;
        }
        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
