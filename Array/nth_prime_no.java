package Array;

import java.util.Scanner;

public class nth_prime_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the position (n) of the prime number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int result = findNthPrime(n);
            System.out.println("The " + n + "th prime number is: " + result);
        }
        
        scanner.close();
    }

    // Method to find the nth prime number
    public static int findNthPrime(int n) {
        int count = 0; // Tracks the number of primes found
        int number = 1; // Number to be tested for primality

        while (count < n) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }

    // Optimized helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        // Check factors up to the square root of the number
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

