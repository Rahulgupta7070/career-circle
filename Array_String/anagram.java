// import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(anagrams(s1, s2));
    }
    public static boolean anagrams(String s1, String s2) {
        if(s1.length()!=s2.length()) {
            return false;
        }

        int[] freq = new int[26];
        for(int i=0; i<s1.length(); i++) {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int count : freq) {
            if(count!=0) {
                return false;
            }
        }
        return true; 
        // char[] a = s1.toCharArray();
        // char[] b = s2.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        // return Arrays.equals(a, b);
    }
}