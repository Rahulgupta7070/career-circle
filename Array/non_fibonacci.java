package Array;

public class non_fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of non-Fibonacci numbers to print
        int prev = 1;
        int curr = 2;
        int count = 0;

        System.out.print("First " + n + " non-Fibonacci numbers: ");
        
        while (count < n) {
            // Print numbers between 'prev' and 'curr' Fibonacci numbers
            for (int i = prev + 1; i < curr && count < n; i++) {
                System.out.print(i + " ");
                count++;
            }
            // Update Fibonacci values
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
    }
}

