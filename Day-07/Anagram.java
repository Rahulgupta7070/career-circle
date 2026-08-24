//! 8. Check whether two Strings are Anagrams

import java.util.HashMap;
class Anagram {
    static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<=str1.length()-1; i++) {
            char ch = str1.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        for(int i=0; i<=str2.length()-1; i++) {
            char ch = str2.charAt(i);
            if(!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch)-1);
        }
        for(Integer value : map.values()) {
            if(value != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Anagram: " + isAnagram("Triangle", "Integral"));
    }
}
/*
! Logic:- Compare character frequencies one by one
 */