public class numPalindrome {
    public static void main(String[] args) {
        int num = 1231;
        int originalNum = num;
        int rev = 0;
        while(num>0) {
            int digit = num % 10;
            rev = rev*10+digit;
            num=num/10;
        }
        if(originalNum==rev)
            System.out.print("Number is Palindrome");
        else
            System.out.print("Number is not Palindrome");
    }
}