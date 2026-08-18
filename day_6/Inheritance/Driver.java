package day_6.Inheritance;

public class Driver {
    public static void main(String[] args) {
        Car creta = new Car();
        creta.start();  // inherited method
        creta.drive();  // Car's own method
    }
}
