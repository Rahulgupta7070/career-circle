//! 2. Check whether a String is Palindrome

class Palindrome {
    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length()-1;

        while (start<end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String Str = "Hello";
        if (isPalindrome(Str)) {
            System.out.println("This is Palindrome: " + isPalindrome(Str));
        } else
            System.out.println("This is NOT Palindrome: " + isPalindrome(Str));
    }
}
/*
! Logic:- Compare first and last characters using two pointers (start and end)
 */