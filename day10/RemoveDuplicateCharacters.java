package day10;
import java.util.HashSet;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String str = "programming";

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}
