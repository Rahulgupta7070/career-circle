package Day_5;

import java.util.Scanner;

public class BankDriver {

    public static void main(String[] args) {

		BankAccount account = new BankAccount();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Account Number..");
		int accountNumber = sc.nextInt();

		System.out.println("Enter the Balance..");
		double balance = sc.nextDouble();

		account.setBankAccount(accountNumber);
		account.setBalance(balance);

		account.displayACDetails();

        sc.close();
	}

    
}
