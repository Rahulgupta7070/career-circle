package Day_7;

public class FindSecondsLargest {

    public static void main(String[] args) {

		int[] a = { 10, 20, 30, 45, 63, 78, 96, 58,85, 63 };

		secondsLargest(a);

	}

	public static void secondsLargest(int[] a) {

		int max = Integer.MIN_VALUE;
		int secondsMax = Integer.MIN_VALUE;

		for (int num : a) {
			if (num > max) {
				secondsMax = max;
				max = num;
			} else if (num > secondsMax && num != max) {
				secondsMax = num;
			}
		}

		System.out.println("Seconds Max: " + secondsMax);
	}
    
}
