package Day_9;

public class GetUniqueCount {
    public static void main(String[] args) {

		String s = "mohammadkamruddeenfromuttarpradeshgonda";

		int result = getUniqueCount(s);

		System.out.println(result);

	}

	public static int getUniqueCount(String s) {

		int[] freq = new int[128];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			freq[c]++;
		}

		int count = 0;

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 1) {
				count++;
			}
		}

		return count;
	}

}
