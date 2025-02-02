public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("123456", "John Doe", 1500.75);
        savings.displaySavingsAccountDetails();
        savings.setBalance(2000.50);
        System.out.println("\nUpdated Balance: $" + savings.getBalance());
    }
}
