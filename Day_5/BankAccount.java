package Day_5;

public class BankAccount {
    
    private int accountNumber;
	private double balance;

	BankAccount() {
		// default constructor
	}

	public void setBankAccount(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {

		return accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void displayACDetails() {

		System.out.println("Account Number is: " + getAccountNumber());
		System.out.println("Balance is: " + getBalance());
	}
    
}
