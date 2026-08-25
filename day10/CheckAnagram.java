package day10;

import java.util.HashMap;

public class CheckAnagram {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {

            char ch = str2.charAt(i);

            if (!map.containsKey(ch)) {
                System.out.println(false);
                return;
            }

            map.put(ch, map.get(ch) - 1);
        }

        for (int count : map.values()) {

            if (count != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}