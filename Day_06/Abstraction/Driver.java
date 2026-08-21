package Day_06.Abstraction;

public class Driver {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Circle Area = " + c.area());
        System.out.println("Rectangle Area = " + r.area());
    }
}
