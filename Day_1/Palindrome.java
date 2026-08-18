package Day_1;

import java.util.Scanner;

public class Palindrome{
   public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the Number...");
    int num=sc.nextInt();

    if(isPlaindrome(num)){
        System.out.println("This Number is a Palindrome: "+num);
    }else{
        System.out.println("This Number is Not a Palindrome: "+num);
    }

   }

   public static boolean isPlaindrome(int num){

    int original=num;
    int reverse=0;

    while(num !=0){
        int digit=num%10;
        reverse=reverse*10+digit;
        num=num/10;
    }

    return original==reverse;
   }
}