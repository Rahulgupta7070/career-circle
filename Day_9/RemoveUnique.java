package Day_9;

public class RemoveUnique {
    public static void main(String[] args) {

		String s = "bdccdegddypgyy";

		String Result = removedUnique(s);
		System.out.println("The Resultant String is: " + Result);
	}

	public static String removedUnique(String s) {

		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {

			freq[s.charAt(i) - 'a']++;
		}
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = c - 97;
			if (freq[index] > 1) {

				res += c;
			}
		}
		return res;

	}

}
