package Assignments;

public class FibonacciSeries {
    public static void main(String[] args) {
        // first we have to take two varible a,b
        int a = 0, b = 1, c;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }

    }
}