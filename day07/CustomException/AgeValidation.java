package day07.CustomException;

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = sc.nextInt();



        try{
            if (age<18) {
                throw new InvalidAgeException("Enter the valid age ");
                
            }
            System.out.println("You are eligible");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            
        }
        finally{
            sc.close();
        }
        }
    }
    

