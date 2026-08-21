package Array;

import java.util.Scanner; // Required for taking user input

public class check_prime_num  {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }
        
        // Check for factors from 2 up to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a factor, so it's not prime
            }
        }
        
        return true; // No factors found, it is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        // Call the method and print the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }

        scanner.close(); // Close the scanner to prevent leaks
    }
}

