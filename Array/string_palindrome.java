package Array;

import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
         String reverse = "";
         for(int i=str.length()-1; i>=0; i--){
                reverse = reverse + str.charAt(i);
         }
         if(str.equals(reverse)){
            System.out.println("palindrome");
         }else{
            System.out.println("not palindrome");
         }
    }
}
