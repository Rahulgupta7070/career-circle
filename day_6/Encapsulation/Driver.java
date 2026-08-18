package day_6.Encapsulation;

public class Driver {
    public static void main(String[] args) {
        BankAccount saving = new BankAccount();

        saving.setAccountNumber(7102020);
        saving.setBalance(5000.6);

        System.out.println(saving.getAccountNumber());
        System.out.println(saving.getBalance());
    }
}
