class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private final int accountNumber; 
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; 
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) { 
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice Johnson", 1001, 5000);
        BankAccount acc2 = new BankAccount("Bob Smith", 1002, 3000);

        acc1.displayAccountDetails();
        System.out.println("-------------------");
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}
