package day07.Exception;

import java.util.Scanner;

public class ArrayIndexCheck {


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int[] a ={10,20,30,40,50};
        int index = sc.nextInt();
        // System.out.println(a[9]);


        try{
            System.out.println(a[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
        sc.close();
        // finally{
        //     System.out.println("Enter the valid index:");

        // }
    }
    
}
