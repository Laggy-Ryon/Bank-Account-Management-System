
class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    // Parameterized constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdrawal method
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    // Display account details
    void displayDetails() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs. " + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Rahul", 5000);
        BankAccount acc2 = new BankAccount(102, "Aman", 10000);

        System.out.println("ACCOUNT 1 OPERATIONS");

        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.checkBalance();

        System.out.println("\nACCOUNT 2 OPERATIONS");

        acc2.deposit(3000);
        acc2.withdraw(20000);
        acc2.withdraw(2000);
        acc2.checkBalance();

        System.out.println("\n===== FINAL ACCOUNT DETAILS =====");

        acc1.displayDetails();
        acc2.displayDetails();
    }
}
