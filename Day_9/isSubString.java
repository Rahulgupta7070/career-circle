package Day_9;

public class isSubString {
    public static void main(String[] args) {

		String s1 = "Manmohan";
		String s2 = "moh";

		if (s1.contains(s2)) {
			System.out.println(s2 + " is: a subString " + s1);
		} else {
			System.out.println(s2 + " is not a sub string " + s1);
		}

	}

}
