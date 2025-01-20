public class Point {
    private int x;

    public void set(int i) {
        x = i;
    }

    public void display() {
        System.out.println("x = " + x);
    }

    public static void main (String[] a) {
        Point p = new Point();
        p.set(5);
        p.display();
    }
}
