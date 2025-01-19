import java.beans.ConstructorProperties;
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

        System.out.println(area_ans + " " + cir_ans);
    }
}
