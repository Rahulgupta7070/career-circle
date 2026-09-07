import java.util.Scanner;

class VotingEligibility1 extends Exception {
    VotingEligibility1(String message) {
        super(message);
    }
}

class VotingEligibility {
    static void checkAge(int age) throws VotingEligibility1 {
        // Logic
        if (age < 18) {
            throw new VotingEligibility1("You are not eligible for voting");
        } else {
            System.out.println("You are eligible for voting");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (VotingEligibility1 e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
