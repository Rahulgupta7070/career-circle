package ConstructorOverloading;

public class Rectangle {
    int length;
    int breadth;
    int side;

    Rectangle(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    Rectangle(int side) {
        this.side=side;
    }
    public void areaRectangle() {
        System.out.println("Area of Rectangle is: "+length*breadth);
    }
    public void areaSquare() {
        System.out.println("Area of Square is: "+side*side);
    }
}