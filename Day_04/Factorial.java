package Day_04;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        int i = 1;

        do {
            fact = fact * i;
            i++;
        } while (i <= n);

        System.out.println(fact);
    }
}
