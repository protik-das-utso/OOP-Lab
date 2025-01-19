
import java.util.Scanner;

class Rectangle{
    int length, width;
    double area, dimension;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void area () {
        area = this.length*this.width;
        System.out.println("Area = " + area);
    }

    public void dimension () {
        dimension = 2*(this.length+this.width);
        System.out.println("Perimeter = " + dimension);
    }
}

public class Five {
    public static void main (String[] args) {
        int length, width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Length  : ");
        length = sc.nextInt();
        System.out.print("Width  : ");
        width = sc.nextInt();

        Rectangle obj = new Rectangle(length, width);

        obj.area();
        obj.dimension();
    }

}
