package Day_02;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 2105;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }
        System.out.print("Reverse: " + rev);
    }

}
