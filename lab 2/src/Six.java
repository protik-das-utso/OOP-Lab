
import java.util.Scanner;

class Book{
    String title, author;
    int price;


    Book () {
        this.title = "Java For Fun";
        this.author = "Protik";
        this.price = 1200;
    }

    Book (String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display () {

        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price : " + this.price);

    }

}

public class Six {
    public static void main (String[] args) {
        String title, author;
        int price;

        Scanner sc = new Scanner(System.in);
        System.out.print("Title  : ");
        title = sc.nextLine();
        System.out.print("Author  : ");
        author = sc.nextLine();
        System.out.print("Price  : ");
        price = sc.nextInt();

        Book b1 = new Book (title, author, price);
        b1.display();

        // For Default
        Book b2 = new Book ();
        b2.display();

    }

}

