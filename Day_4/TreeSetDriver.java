package Day_4;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDriver {
    public static void main(String[] args) {

		TreeSet<TreeSetProgramStudent> students = new TreeSet<>(

				Comparator.comparing(TreeSetProgramStudent::getName).reversed()
		);

		students.add(new TreeSetProgramStudent(101, "Rahul"));
		students.add(new TreeSetProgramStudent(102, "Amit"));
		students.add(new TreeSetProgramStudent(103, "Nadeem"));
		students.add(new TreeSetProgramStudent(104, "Pooja Rani"));
		students.add(new TreeSetProgramStudent(105, "Geeta Rani"));
		students.add(new TreeSetProgramStudent(106, "Neha Rani"));
		students.add(new TreeSetProgramStudent(107, "Mohit Bhai"));

		for (TreeSetProgramStudent student : students) {
			System.out.println(student);
		}
    }
}
