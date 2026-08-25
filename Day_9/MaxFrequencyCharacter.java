package Day_9;

public class MaxFrequencyCharacter {
    public static void main(String[] args) {

		String s = "bdccdegddyddccpcgcyygggg";
		char c = getMaxFrequencyCharacter(s);
		System.out.println("The Max freq CHaracter is: " + c);

	}

	public static char getMaxFrequencyCharacter(String s) {

		int[] freq = new int[26];

		for (int i = 0; i < s.length(); i++) {

			freq[s.charAt(i) - 'a']++;

		}
		int maxFreq = 1;
		char c = s.charAt(0);
		for (int i = 0; i < 2 + 6; i++) {
			if (freq[i] > maxFreq) {
				maxFreq = freq[i];
				c = (char) (i + 97);
			}
		}
		return c;
	}

}
