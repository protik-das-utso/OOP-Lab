/*
* 4. Create a Car Class
Design a Car class with:
• Attributes: brand, model, year, and price.
• Method: displayDetails() to display all car information.
Instantiate two Car objects with different data and call the displayDetails() method for each.
Expected Outcome:
Practice creating multiple objects of a class and invoking their methods.
* */

import java.util.Scanner;

class Car {
    String brand, model;
    int year, price;

    Car(String brand, String model, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Brand Name : " + this.brand);
        System.out.println("Car Model : " + this.model);
        System.out.println("Year : " + this.year);
        System.out.println("Price : " + this.price);
    }

}

public class Four {
    public static void main (String[] args) {
        String brand, model;
        int year, price;
        Scanner sc = new Scanner(System.in);
        System.out.print("Brand Name : ");
        brand = sc.nextLine();
        System.out.print("Model Name : ");
        model = sc.nextLine();
        System.out.print("Year : ");
        year = sc.nextInt();
        System.out.print("Price : ");
        price = sc.nextInt();

        Car c1 = new Car(brand, model, year, price);
        c1.displayDetails();
    }
}