/*
* 1. Create a Student Class
Write a program to create a Student class with the following attributes: name, ID, and CGPA.
Add methods to:
• Input student details.
• Display the details of the student.
Expected Outcome:
Students will practice creating a class, defining attributes, and using methods to manipulate
class data.
* */

import java.util.Scanner;

class Student {
    String name;
    int id;
    double cgpa;

    public void inputfunc() {
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.id = sc.nextInt();
        this.cgpa = sc.nextDouble();
    }

    public void outputfunc() {
        System.out.println(this.name + " " + this.id + " " + this.cgpa);
    }
}

public class One {
    public static void main (String[] args) {
        Student s1 = new Student();
        s1.inputfunc();
        s1.outputfunc();
    }
}
