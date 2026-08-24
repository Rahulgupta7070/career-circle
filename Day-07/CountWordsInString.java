//! 9. Count number of words in a String

class CountWordsInString {
    static int countWords(String str) {
        int count = 0;
        for(int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) != ' ') {
                if(i ==0 || str.charAt(i-1) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Java is high level programming language";
        System.out.println("Number of words = " + countWords(str));
    }
}

// ! Without Using Inbuilt method like split()
/* 
class CountWordsInString {
    static int countWords(String str) {
        str = str.trim();
        if(str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String str = "Java is a secure Programming language";
        System.out.println("Number of words: " + countWords(str));
    }
}
*/
/*
!Logic:- Split string based on whitespace (blankspace)
 */