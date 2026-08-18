package Day_2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number...");
		int marks = sc.nextInt();

		printGrade(marks);

        sc.close();
	}

	public static void printGrade(int marks) {

		if (marks >= 90 && marks <= 100) {
			System.out.println("Grade A");
		} else if (marks > 80 && marks <= 89) {
			System.out.println("Grade B");
		} else if (marks >= 70 && marks <= 79) {
			System.out.println("Grade C");
		} else if (marks >= 60 && marks <= 69) {
			System.out.println("Grade D");
		} else if (marks >= 0 && marks <= 60) {
			System.out.println("Fail");
		} else {
			System.out.println("Invalid Marks..");
        
		}
        
	}

}
