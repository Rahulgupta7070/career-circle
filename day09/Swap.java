import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First value:  ");
        int First = sc.nextInt();
        
        System.out.println("Enter the Second value:  ");
        int Second = sc.nextInt();

        System.out.println("First is: " + First + "\tSecond is: " + Second);

        First = First + Second;
        Second = First - Second;
        First = First - Second;

        System.out.println("First is: " + First + "\tSecond is: " + Second);
        sc.close();

    }

}
