import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        int First = 0;
        int Second = 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n ;i++){
            System.out.println(First +" ");
            int next = First+Second;
            First=Second;
            Second=next;

        }
        sc.close();
    }
}