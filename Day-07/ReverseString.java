//! 1. Reverse a String without using reverse() in built method

class ReverseString {
    static String findReverse(String str) {
        String result = "";
        for(int i=str.length()-1; i>=0; i--) {
            result = result+str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("Reversed String: " + findReverse(str));
    }
}
/*
!Logic:- Traverse from last index to first
 */