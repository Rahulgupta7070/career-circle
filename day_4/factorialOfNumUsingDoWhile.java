public class factorialOfNumUsingDoWhile {
    public static void main(String[] args) {
        numFactorial(123);
    }
    public static void numFactorial(int n) {
        int rev = 0;
        int originalNumber = n;
        do {
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        while(n>0);
        
        if(originalNumber==rev) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}