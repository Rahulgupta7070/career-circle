package Day_06.Encapsulation;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public int getAccountNumber() {
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
        BankAccount b = new BankAccount();

        b.setAccountNumber(101);
        b.setBalance(5000);

        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());
    }
}
