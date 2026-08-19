package Day_03;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int greater = (a > b) ? a : b;
        System.out.println(greater + " is greater");
    }
}
