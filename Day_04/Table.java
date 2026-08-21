package Day_04;

public class Table {
    public static void main(String[] args) {
        int n = 7;

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : numbers) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
