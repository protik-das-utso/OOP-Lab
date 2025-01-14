/*
* Simple Interest Calculator
•	Objective: Perform basic arithmetic calculations.
•	Problem: Write a Java program to calculate simple interest using the formula:
SI=P×R×T100\text{SI} = \frac{P \times R \times T}{100}SI=100P×R×T
where P is the principal amount, R is the rate of interest, and T is the time in years.

* */

import java.util.*;

public class Two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P, R, SI;
        int T;
        System.out.print("Enter Principal Amount: ");
        P = sc.nextDouble();
        System.out.print("Enter Rate: ");
        R = sc.nextDouble();
        System.out.print("Enter Time: ");
        T = sc.nextInt();
        SI = P*R*T/100;
        System.out.println("Total Profit = " + SI);
    }
}