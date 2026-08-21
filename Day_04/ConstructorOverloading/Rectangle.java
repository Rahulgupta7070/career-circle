package Day_04.ConstructorOverloading;

public class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }

    void area() {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(7);

        r1.area();
        r2.area();
    }
}
