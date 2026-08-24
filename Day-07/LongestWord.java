//! 10. Find the longest word in a String

// class LongestWord {
//     static String longestWord(String str) {
//         String[] words = str.split("\\s+");
//         String longest = "";
//         for(String word : words) {
//             if(word.length() > longest.length()) {
//                 longest = word;
//             }
//         }
//         return longest;
//     }
//     public static void main(String[] args) {
//         String str = "Java is robust programming language";
//         System.out.println("Longest Word: " + longestWord(str));
//     }
// }


// ! Witout using inbuilt method like split()
class LongestWord {
    static String longestWord(String str) {
        String longestWord = "";
        String currentWord = "";
        for(int i=0; i<=str.length()-1; i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                currentWord = currentWord+ch;
            } else {
                if(currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }
        if(currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }
        return longestWord;
    }
    public static void main(String[] args) {
        String str = "Java is known for its security";
        System.out.println("Longest Word = " + longestWord(str));
    }
}
/*
! Logic:- Compare lengths of each word
 */