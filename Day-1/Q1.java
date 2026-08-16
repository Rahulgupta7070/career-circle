public class Q1 {
    public static void main(String[] args){
        int n = 12345;
        int reverseNumber = reverse(n);
        System.out.println("Reverse of " + n + " is: " + reverseNumber);
    }

    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
}
