class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    public void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    public void displayWithdrawalLimit() {
        System.out.println("Withdrawal Limit: $" + withdrawalLimit + " per transaction");
    }
}

class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; 

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    public void displayMaturityPeriod() {
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.0, 4.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 3000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD54321", 10000.0, 12);

        System.out.println("\nSavings Account Details:");
        savings.displayAccountDetails();
        savings.displayAccountType();
        savings.displayInterestRate();

        System.out.println("\nChecking Account Details:");
        checking.displayAccountDetails();
        checking.displayAccountType();
        checking.displayWithdrawalLimit();

        System.out.println("\nFixed Deposit Account Details:");
        fixedDeposit.displayAccountDetails();
        fixedDeposit.displayAccountType();
        fixedDeposit.displayMaturityPeriod();
    }
}
