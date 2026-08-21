package Encapsulation;

public class BankAccount {
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		BankAccount b = new BankAccount(12324242343422l,150000);
		System.out.println("accountNumber is "+b.getAccountNumber());
		System.out.println("Current balance is "+b.getBalance());
	}

}
