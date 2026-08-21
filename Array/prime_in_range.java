package Array;

import java.util.Scanner;

public class prime_in_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input for the range
        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();
        
        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();

        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
        
        // Loop through the given range
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }
        
        // Check for factors up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a factor, so it is not prime
            }
        }
        
        return true; // No factors found, it is prime
    }
}
