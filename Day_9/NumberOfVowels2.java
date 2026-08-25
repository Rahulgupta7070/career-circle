package Day_9;

public class NumberOfVowels2 {
    public static void main(String[] args) {

		String s = "noidasecterfive";

		numberOfVowels2(s);

	}

	public static void numberOfVowels2(String s) {

		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

				count++;

		}

		System.out.println("Total Character is: " + count);

	}

}
