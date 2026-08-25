import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateCharFromString {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(removeDuplicate(str));
    }
    public static StringBuilder removeDuplicate(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for(char ch : str.toCharArray()) {
            set.add(ch);
        } 
        StringBuilder sb = new StringBuilder();
        for(char c : set) {
            sb.append(c);
        }
        return sb;
        // String s = "";
        // for(char ch : set) {
        //     s=s+ch;
        // }
        // return s;
    }
}