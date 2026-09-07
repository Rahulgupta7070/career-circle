package CustomException;

public class CustomExceptionDemo {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("You can vote");

    }

    public static void main(String[] args) {
        int age = 13;
        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
