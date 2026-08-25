package Day_9;

public class isSubString2 {
    public static void main(String[] args) {

		String s = "Manmohan";
		String sub = "moh";

		boolean Result = isSubString(s, sub);
		System.out.println(Result);

//		System.out.println(isSubString(s, sub));

	}

	public static boolean isSubString(String s, String sub) {

		for (int i = 0; i < s.length() - sub.length(); i++) {
			int j;
			for (j = 0; j < sub.length(); j++) {
				if (s.charAt(i + j) != sub.charAt(j))
					break;
			}
			if (j == sub.length())
				return true;
		}
		return false;
	}

}
