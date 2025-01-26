/*
* 3. Develop a BankAccount Class
Create a BankAccount class with:
• Attributes: accountNumber, accountHolderName, and balance.
• Methods to:
• Deposit an amount.
• Withdraw an amount (check if sufficient balance is available).
• Display the current balance.
Expected Outcome:
Students will learn about methods interacting with attributes and validating data.
* */

import java.util.Scanner;

class BankAccount {
    int accountNumber,balance;
    String accountHolderName;
    Scanner sc = new Scanner(System.in);

    BankAccount (int accNum, String accName, int balance) {
        this.accountNumber = accNum;
        this.accountHolderName = accName;
        this.balance = balance;
    }

    public void deposit() {
        int add;
        add = sc.nextInt();
        this.balance += add;
    }

    public void withdraw() {
        int sub;
        sub = sc.nextInt();
        if (this.balance > sub) {
            this.balance -= sub;
        } else {
            System.out.println("Insuf");
        }

    }

    public void display() {
        System.out.println("Name : " + this.accountHolderName);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Total Balance : " + this.balance);
    }


}
public class Three {
    public static void main (String[] args) {
        int accNum;
        String accName;
        int balance, choice;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number : ");
        accNum = sc.nextInt();
        System.out.print("Name : ");
        sc.nextLine();
        accName = sc.nextLine();
        System.out.print("Balance : ");
        balance = sc.nextInt();

        BankAccount person1 = new BankAccount(accNum, accName, balance);
        while(true) {
            System.out.print("1. Deposit\n2. Withdraw\n3. Display\n4. Exit");
            choice = sc.nextInt();
            if(choice == 1) {
                person1.deposit();
            } else if (choice == 2) {
                person1.withdraw();
            } else if (choice == 3) {
                person1.display();
            } else if (choice == 4) {
                return;
            }
        }


    }
}
