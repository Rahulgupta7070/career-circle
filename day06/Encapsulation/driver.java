package day06.Encapsulation;

public class driver {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        
        account.setAccountNumber(101);
        account.setBalance(50000.50);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}

