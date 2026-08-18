package ConstructorOverloading;

public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,4);
        Rectangle s1 = new Rectangle(5);
        r1.areaRectangle();
        s1.areaSquare();
    }
}