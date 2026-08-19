package Day_1;

import java.util.Scanner;

public class ArrayException {
    public static void getElement(int[] a, int index) {

		try {

			System.out.println("Element index " + index + " : " + a[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
        
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size: ");
		int size = sc.nextInt();

		int[] a = new int[size];

		System.out.println("Enter " + size + " element:");

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter index:");
		int index = sc.nextInt();

		getElement(a, index);
        sc.close();
	}
}
