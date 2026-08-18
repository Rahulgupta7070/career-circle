package MethodOverloading;

public class Driver {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        int result1 = c1.add(5, 10);   // int, int → first method
        double result2 = c1.add(5.5, 4.5);   // double, double → second method
        int result3 = c1.add(10, 20, 30);   // int, int, int → third method

        System.out.println("Sum of two integers is: "+result1);      
        System.out.println("Sum of two doubles is: "+result2);   
        System.out.println("Sum of three integers is: "+result3);   
    }
}
