package day_6.Abstraction;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius=radius;
    }
    @Override
    double area() {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }
    @Override
    double area() {
        return length*width;
    }
}
public class Driver {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(10,5);
        System.out.println("Area of Circle is: "+c1.area());
        System.out.println("Area of Rectangle is: "+r1.area());
    }
}