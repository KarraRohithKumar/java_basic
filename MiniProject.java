package Encapselation;

public class MiniProject {//Bankaccount
    // Private fields: Encapsulated data
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor to initialize account details
    public MiniProject(String accountHolderName, String accountNumber, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for account holder's name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount should be greater than 0.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount should be greater than 0.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

    

