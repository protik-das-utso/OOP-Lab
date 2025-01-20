import java.util.Scanner;

class TemperatureConverter {
    double temp;
    TemperatureConverter (double temp) {
        this.temp = temp;
    }
    public void celToFah() {
        double fah = this.temp*(1.8) + 32;
        System.out.println("Cel " + this.temp + " to Fah = " + fah);
    }

    public void fahToCel() {
        double cel = ((this.temp-32)/9)*5;
        System.out.println("Fah " + this.temp + " to Cel = " + cel);
    }

}

public class Ten {
    public static void main (String[] args) {
        double temp, choice;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temp:  : ");
        temp = sc.nextDouble();
        TemperatureConverter t1 = new TemperatureConverter(temp);
        System.out.print("1. Cen to Fah\n2. Fah to Cel");
        choice = sc.nextInt();
        if (choice == 1) {
            t1.celToFah();
        } else if (choice == 2) {
            t1.fahToCel();
        }
    }
}
