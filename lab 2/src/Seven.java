import java.util.Scanner;

class Person {
    String name;
    int age, current_year = 2025;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void year_of_birth () {
        System.out.println("Birth Year : " + (current_year-this.age));
    }
    public void details () {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }


}

public class Seven {
    public static void main (String[] args) {
        String name;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.print("Age : ");
        age = sc.nextInt();

        Person person1 = new Person(name, age);
        person1.year_of_birth();
        person1.details();

    }
}
