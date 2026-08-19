package Day_6;

import java.util.ArrayList;
import java.util.List;

public class CollectionProgram {
    

    public static void main(String[] args) {

		List<String> students = new ArrayList<>();

		students.add("Pooja Rani");
		students.add("Geeta Rani");
		students.add("Roshani");
		students.add("Khushbu");

		System.out.println("Student: ");
		System.out.println();

		for (String Student : students) {
			System.out.println(Student);
		}

		students.remove("Geeta Rani");

		System.out.println();
		System.out.println("After Removed..:");
		System.out.println();

		for (String student : students) {
			System.out.println(student);
		}
	}
}
