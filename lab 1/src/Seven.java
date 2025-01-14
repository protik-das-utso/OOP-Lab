/*
* Fibonacci Sequence
•	Objective: Practice loops and sequence generation.
•	Problem: Write a program to display the first n terms of the Fibonacci sequence.

* */

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int c = sc.nextInt();
        int a = 0, b = 1, d = 0, temp;
        System.out.print(a + ", " + b);
        for (int i = 1; i < c-1; i++) {
            d = a + b;
            a = b;
            b = d;
            System.out.print(", " + d);
        }

    }
}
