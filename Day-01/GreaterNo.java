
import java.util.Scanner;
class GreaterNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greater = (a>b) ? a:b;
        System.out.println(greater + " is greater");
    }
}