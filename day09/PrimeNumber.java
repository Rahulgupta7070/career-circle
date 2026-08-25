import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number which you want to check:  ");
         int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }
    }
}
        

    


// I first handle numbers less than or equal to 1. 
// Then I check divisibility from 2 up to the square root of the number. 
// If any number divides it completely, it is not prime.
// Otherwise, it is prime. The time complexity is O(√n) and space complexity is O(1).
