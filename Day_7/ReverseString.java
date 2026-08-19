package Day_7;

public class ReverseString {
    
    public static void main(String[] args) {

		String str = "Mohammad Kamruddeen";

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println("The Original String is: " + str);
		System.out.println("After Reverse a String: " + reverse);
	}

}
