package Day_2;

import java.util.Scanner;

public class StudentDriver2 {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name: ");
		String name = sc.nextLine();

		System.out.println("Enter the Age: ");
		int age = sc.nextInt();

		Student2 student2 = new Student2();

		student2.setName(name);
		student2.setAge(age);
		student2.display();
        sc.close();
    }
}
