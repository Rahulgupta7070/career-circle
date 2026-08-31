
class LongestWord {
    static String findLongestWord(String str) {
        String longest = "";
        String curr = "";
        for(int i=0; i<=str.length()-1; i++) {
            char ch = str.charAt(i);
            if(ch !=' ') {
                curr = curr+ch;
            } else {
                if(curr.length()>longest.length()) {
                    longest = curr;
                }
                curr = "";
            }
        }
        if(curr.length() > longest.length()) {
            longest = curr;
        }
        return longest;
    }
    public static void main(String[] args) {
        String str = "Java is object oriented language";
        String res = findLongestWord(str);
        System.out.println("Longest word = " + res);
    }
}
