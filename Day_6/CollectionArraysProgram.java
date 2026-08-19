package Day_6;

public class CollectionArraysProgram {
    
    
	public static void main(String[] args) {

		String[] student = new String[3];

		student[0] = "Mohammad Kamruddeen";
		student[1] = "Pooja Rani";
		student[2] = "Geeta Rani";

		for (String students : student) {
			System.out.println(students);
		}
	}
}
