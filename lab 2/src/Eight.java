import java.util.Scanner;

class Employee {
    String employeeID, name;
    int salary;
    Employee (String employeeID, String name, int salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;

    }
    public void details () {
        System.out.println("Employee ID : " + this.employeeID);
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
    }
    public void totalSalary() {
        this.salary += (this.salary*0.10);
        System.out.println("Incremented Salary : " + this.salary);
    }
}

public class Eight {
    public static void main (String[] args) {
        String employeeID, name;
        int salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee ID : ");
        employeeID = sc.nextLine();
        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.print("Salary : ");
        salary = sc.nextInt();

        Employee e1 = new Employee(employeeID, name, salary);
        e1.details();
        e1.totalSalary();

    }
}