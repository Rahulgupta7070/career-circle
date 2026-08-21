package Assignments;

public class SwapTwoNumWithoutThird {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: \nA: " + a + " B: " + b);

        a = a + b;// a = 10, b = 20 , c=a+b , c = 30
        b = a - b;// b = 10-20, b = 10
        a = a - b;// a = 30 - 10 , a = 20

        System.out.println("After swapping: \nA: " + a + " B: " + b);
    }
}
