import java.util.Scanner;

class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingEligibility1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18)
            throw new InvalidAgeException("You are not eligible for voting");
        System.out.println("You are eligible for voting");
    }
}
