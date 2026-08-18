import java.util.Scanner;
public class greaterNumberUsingConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Greater Number is: "+maxNum(a, b));
        sc.close();
    }
    public static int maxNum(int n1, int n2) {
        int max = (n1>n2) ? n1 : n2;
        return max;
    }
}