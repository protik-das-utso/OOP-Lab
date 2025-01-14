/*
* Palindrome Checker
•	Objective: Use loops and string manipulation.
•	Problem: Write a program to check whether a given string is a palindrome.

* */

import java.io.*;
import java.util.Scanner;

public class Eigth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        str = str.toLowerCase();
        String str2 = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            str2 = ch + str2;
        }
        if (str2.equals(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
