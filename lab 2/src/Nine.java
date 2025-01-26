/*
* 9. Design a Triangle Class
Create a Triangle class with:
• Attributes: sideA, sideB, and sideC.
• Methods to:
• Calculate and return the perimeter.
• Check if the triangle is valid (sum of any two sides > the third side).
Test the class by taking side lengths as input and verifying its validity.
Expected Outcome:
Understand attribute validation and conditional logic within methods.
* */

import java.util.Scanner;

class Triangle {
    int sideA, sideB, sideC;

    Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void perimeter() {
        System.out.println("Perimeter = " + (sideA + sideB + sideC));
    }

    public void valid() {
        int flag = 0;
        if ((this.sideA + this.sideB) > this.sideC) {
            if ((this.sideB + this.sideC) > this.sideA) {
                if ((this.sideC + this.sideA) > this.sideB) {
                    System.out.println("Valid");
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Invalid");
        }

    }
}


public class Nine {
    public static void main (String[] args) {
        int sideA, sideB, sideC;

        Scanner sc = new Scanner(System.in);
        System.out.print("Side A : ");
        sideA = sc.nextInt();
        System.out.print("Side B : ");
        sideB = sc.nextInt();
        System.out.print("Side C : ");
        sideC = sc.nextInt();



        Triangle tr1 = new Triangle(sideA, sideB, sideC);
        tr1.perimeter();
        tr1.valid();


    }
}