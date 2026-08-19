package Assignments;

public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int temp;
        System.out.println("Before swapping:\nA: " + a + "\nB: " + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

    }
}
