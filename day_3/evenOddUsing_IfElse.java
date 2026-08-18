import java.util.Scanner;
public class evenOddUsing_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check even or odd: ");
        int n = sc.nextInt();
        oddEven(n);
        sc.close();
    }
    public static void oddEven(int n) {
        if(n%2==0) {
            System.out.print("This is Even number");
        }
        else{
            System.out.print("This is Odd number");
        }
    }
}
