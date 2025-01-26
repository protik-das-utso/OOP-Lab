import java.util.Date;

class Student {
    String stuid;
    String name;
    double cgpa;
    Student(String stuid, String name, double cgpa) {
        this.stuid = stuid;
        this.name = name;
        this.cgpa = cgpa;
    }
    public void display() {
        System.out.println("Student ID: " + stuid + "\nName: " + name + "\nCGPA: " + cgpa);
    }
}
class Exam {
    String examid;
    String name;
    int marks;

    Exam(String examid, String name, int marks) {
        this.examid = examid;
        this.name = name;
        this.marks = marks;
    }
    public void display() {
        System.out.println("Exam ID: " + examid + "\nName: " + name + "\nMarks: " + marks);
    }
}
class TakeExam {
    Date date;

    TakeExam(Date date) {
        this.date = date;
    }
    public void display(Student s, Exam e) {
        System.out.println("Exam Date: " + date + "\n");
        s.display();
        e.display();
    }
}

public class Exercise {
    public static void main(String[] args) {
        Student s = new Student("232-15-197", "Protik Das Utso", 85);
        Exam e = new Exam ("CSE221", "EXAM FOR FUN", 100);
        Date currentDate = new Date();
        TakeExam te = new TakeExam(currentDate);
        te.display(s, e);
    }
}
