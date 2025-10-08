package labWork5;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
        this.accountNumber = "000001";
        this.balance = 67;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        System.out.println("Account number: " + bankAccount.getAccountNumber());
        System.out.println("Account balance: " + bankAccount.getBalance());

        bankAccount.setAccountNumber("000002");
        System.out.println("\nAccount number: " + bankAccount.getAccountNumber());
        bankAccount.setBalance(1000);
        System.out.println("Account balance: " + bankAccount.getBalance());
    }
}
