import java.util.Scanner;

public class Table {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int n = sc.nextInt();

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i : arr){
            System.out.println(n + " x " + i + " = " + (n*i));

        }

    }

}
