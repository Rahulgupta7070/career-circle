public class LongestWord {

    public static void main(String[] args) {

        String str = "Java is a programming language";

        String[] words = str.split(" ");

        String longest = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Longest word: " + longest);
    }
}