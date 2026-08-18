package String;

public class FirNonRepeChaString {
	public static void main(String[] args) {
		String s="abbcdde";
		int[] fre = new int[20];
		for(int i=0; i<s.length(); i++) {
			fre[s.charAt(i)-'a']++;
		}
		for(int i=0; i<fre.length; i++) {
			if(fre[i]==1) {
				System.out.print((char)(i+97));
			}
		}
	}
}
