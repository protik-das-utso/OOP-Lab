/*
* 2. Define a Circle Class
Create a Circle class with:
• Attribute: radius.
• Methods to calculate the area and circumference of a circle.
Take the radius as input from the user and display the calculated area and circumference.
Expected Outcome:
Understand how to define attributes, methods, and perform calculations in a class.
* */


import java.util.Scanner;
import static java.lang.Math.pow;


class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    public double area () {
        return 3.1416*pow(this.radius, 2);
    }

    public double cir () {
        return 2*3.1416*this.radius;
    }
}


public class Two {
    public static void main (String[] args) {
        double radius, area_ans, cir_ans;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        Circle c1 = new Circle(radius);
        c1.radius = 7;
        area_ans = c1.area();
        cir_ans = c1.cir();
        System.out.println(cir_ans);

        System.out.println(area_ans + " " + cir_ans);
    }
}
