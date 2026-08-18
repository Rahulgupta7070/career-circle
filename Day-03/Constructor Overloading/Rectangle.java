class Rectangle {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }
    void area() {
        System.out.println("Area: " + (length*breadth));
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        Rectangle s = new Rectangle(7);
        System.out.println("Area of Rectangle: ");
        r.area();
        System.out.println("Area of Square: ");
        s.area();
    }
}