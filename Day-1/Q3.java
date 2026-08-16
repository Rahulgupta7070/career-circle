public class Q3 {
    public static void main(String[] args){
        int n = 12324;
        String res = palindrome(n) ? n + " is a palindrome" : n + " is not a palindrome";
        System.out.println(res);
    }

    public static boolean palindrome(int n){
        int org = n;
        int rev = 0;
        while(n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return org == rev;
    }
}
