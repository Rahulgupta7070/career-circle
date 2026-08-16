public class Q2 {
    public static void main(String[] args){
        int n = 23485;
        int sum = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + sum);
    }

    public static int sumOfDigits(int n){
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
    return sum;
    }
}
