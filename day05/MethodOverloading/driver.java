package day05.MethodOverloading;

public class driver {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();


        System.out.println(c1.add(5, 10));
        System.out.println(c1.add(5.5, 2.5));
        System.out.println(c1.add(10, 20, 30));

    }
    
}
