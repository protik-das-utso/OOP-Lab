/*
* Customer buy Item. Customer is identified by custid, name and email. Item is identified by itemid, name, price. Customer buy on a date and with specific quantity.
* */

import java.util.Date;
import java.util.Scanner;

class Customer {
    String cusid;
    String name;
    String email;

    Customer (String cusid, String name, String email) {
        this.cusid = cusid;
        this.name = name;
        this.email = email;
    }
    public void display() {
        System.out.println("Customer ID: " + cusid + "\nName: " + name + "\nEmail: " + email);
    }
}
class Item {
    int itemid;
    String name;
    int price;

    Item (int itemid, String name, int price) {
        this.itemid = itemid;
        this.name = name;
        this.price = price;
    }
    public void display() {
        System.out.println("Item ID: " + itemid + "\nName: " + name + "\nPrice: " + price);
    }
}

class Buy {
    Date date;
    int quantity;
    Customer customer;
    Item item;

    Buy (Date date, int quantity) {
        this.date = date;
        this.quantity = quantity;
    }
    public void display(Customer c, Item i) {
        System.out.println("Date : " + date + "\nQuantity: " + quantity);
        c.display();
        i.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("1", "Protik", "protikdas018830@gmail.com");
        Item i = new Item(101, "Java Tricks Book", 100);

        Date currentDate = new Date();
        Buy b = new Buy(currentDate,2);
        b.display(c, i);
    }
}

//////////////////////////////////////// OR /////////////////////////////////

import java.util.Date;
import java.util.Scanner;

class Customer {
    String cusid;
    String name;
    String email;

    Customer (String cusid, String name, String email) {
        this.cusid = cusid;
        this.name = name;
        this.email = email;
    }
    public void display() {
        System.out.println("Customer ID: " + cusid + "\nName: " + name + "\nEmail: " + email);
    }
}
class Item {
    int itemid;
    String name;
    int price;

    Item (int itemid, String name, int price) {
        this.itemid = itemid;
        this.name = name;
        this.price = price;
    }
    public void display() {
        System.out.println("Item ID: " + itemid + "\nName: " + name + "\nPrice: " + price);
    }
}

class Buy {
    Date date;
    int quantity;
    Customer customer;
    Item item;

    Buy (Date date, int quantity, Customer customer, Item item) {
        this.date = date;
        this.quantity = quantity;
        this.customer = customer;
        this.item = item;
    }
    public void display() {
        System.out.println("Date : " + date + "\nQuantity: " + quantity);
        customer.display();
        item.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("1", "Protik", "protikdas018830@gmail.com");
        Item i = new Item(101, "Java Tricks Book", 100);

        Date currentDate = new Date();
        Buy b = new Buy(currentDate,2, c, i);
        b.display();
    }
}