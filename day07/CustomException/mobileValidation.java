package day07.CustomException;

import java.util.Scanner;

public class mobileValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile number: ");

        String mobileNumber =  sc.next();

        try{
            if (mobileNumber.length() != 10) {
                throw new InvalidMobileException("Enter the 10 digit number!");
                
            }
            System.out.println("Valid");
        }catch(InvalidMobileException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }
    
}
