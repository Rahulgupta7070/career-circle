package Day_2;

import java.util.Scanner;

public class StudentDriver {
    
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name..");
		String name = sc.nextLine();

		System.out.println("Enter the Age..");
		int age = sc.nextInt();

		Student student1 = new Student();
		Student student2 = new Student(name);
		Student student3 = new Student(name, age);

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

        sc.close();
	
    }
}
