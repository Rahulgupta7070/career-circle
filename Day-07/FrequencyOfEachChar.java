//! 4. Find frequency of each character

import java.util.HashMap;
public class FrequencyOfEachChar {
    static void characterFrequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.print("Character Frequency");
        for(Character ch : map.keySet()) {
            System.out.println(ch + " = " + map.get(ch));
        }
    }
    public static void main(String[] args) {
        String str = "I am Software Developer";
        System.out.println("Charactr Frequency");
        characterFrequency(str);
    }
}
/*
!Logic:- HashMap<Character, Integer>
 */