package customException;

public class CheckedExc {

	public static void check(int age) throws IvalidAgeExceptionUncheckedExc {
		if (age < 18) {
			throw new IvalidAgeExceptionUncheckedExc("Age must be 18 or above");
		}
		System.out.println("You are eligible");
	}

	public static void main(String[] args) {
		try {
			check(15);
		} catch (IvalidAgeExceptionUncheckedExc e) {
			System.out.println(e.getMessage());
		}
	}
}
