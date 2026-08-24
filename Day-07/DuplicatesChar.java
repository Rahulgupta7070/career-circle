//! 5. Find duplicate characters

import java.util.HashMap;
class DuplicatesChar {
    static void findDuplicatesCharacters(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<=str.length()-1; i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.print("Duplicates Characters: ");
        for(Character ch: map.keySet()) {
            if(map.get(ch)>1) {
                System.out.println(ch);
            }
        }
    }
    public static void main(String[] args) {
        String str = "Java is Object-oriented language";
        System.out.println("Duplicates");
        findDuplicatesCharacters(str);
    }
}
/*
!Logic:- Frequency > 1
 */