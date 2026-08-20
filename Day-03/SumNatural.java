import java.util.Scanner;

class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0, i = 1;
        while (i<=n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}