package Day_06.Abstraction;

public class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    double area() {
        return length * width;
    }
}
