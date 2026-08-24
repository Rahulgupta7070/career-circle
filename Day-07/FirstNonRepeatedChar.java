//! 6. Find first non-repeated character

import java.util.HashMap;

class FirstNonRepeatedChar {
    static char firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<=str.length()-1; i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        for(int i=0; i<=str.length()-1; i++) {
            char ch = str.charAt(i);
            if(map.get(ch)==1) {
                return ch;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        char result = firstNonRepeatedCharacter("Missippi");
        System.out.println("First Non-Repeated Character: " + result);
    }
}
/*
! Logic:- Frequency = 1, then traverse original string and print character in main method
 */