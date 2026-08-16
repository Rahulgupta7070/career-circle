package day07;

import java.util.Scanner;

public class ArrayIndexCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = { 10, 20, 30, 40, 50 };
        System.out.println("Enter index: ");
        int index = sc.nextInt();

        try {
            System.out.println(a[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } finally {
            sc.close();

        }

    }

}
