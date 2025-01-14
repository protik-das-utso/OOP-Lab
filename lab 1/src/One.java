/*
* 1. Fahrenheit to Celsius Converter
•	Objective: Practice basic mathematical operations and user input.
•	Problem: Write a Java program to convert a temperature from Fahrenheit to Celsius using the formula:
Celsius=(Fahrenheit−32)×59\text{Celsius} = (\text{Fahrenheit} - 32) \times \frac{5}{9}Celsius=(Fahrenheit−32)×95

* */
import java.util.*;

public class One{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, f;
        System.out.print("Enter Temp in Fahrenheit: ");
        f = sc.nextDouble();
        c = ((f-32)*5)/9;
        System.out.println("Censius = " + c);
    }
}