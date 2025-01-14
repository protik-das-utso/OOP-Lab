//Prime Number Checker
//        •	Objective: Use loops and conditional statements.
//        •	Problem: Write a program to check whether a given number is prime.


import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int flag = 0;
        if(n==1) {
            System.out.println("Not Prime");
        } else {
            for(int i=2;i<=n/2;i++) {
                if(n%i==0) {
                    flag = 1;
                    break;
                }
            }
            if (flag ==1) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
        }
    }
}
