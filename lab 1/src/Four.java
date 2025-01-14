/*
* Sum of Digits
•	Objective: Practice loops and digit manipulation.
•	Problem: Write a program to calculate the sum of the digits of a given number.

* */

import java.util.*;

public class Four{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int sum = 0;
        int m = 0;
        int digit = Integer.parseInt(num);
        do {
            m = digit%10;
            digit = digit/10;
            sum += m;
        } while (m > 0);

        System.out.println("Total Sum: " + sum);
    }
}
