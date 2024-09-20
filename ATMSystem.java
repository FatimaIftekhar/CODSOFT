import java.util.Scanner;

// BankAccount Class: Manages user's account balance.
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Method to check the account balance
    public double checkBalance() {
        return balance;
    }
}

// ATM Class: Provides an interface for the user to interact with their bank account.
class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Display the ATM menu
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nWelcome to the ATM");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);

        scanner.close();
    }

    // Method to withdraw money
    private void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (bankAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful. Please collect your money.");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Method to deposit money
    private void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (bankAccount.deposit(amount)) {
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }

    // Method to check the account balance
    private void checkBalance() {
        System.out.println("Your current balance is: $" + bankAccount.checkBalance());
    }
}

// Main class to run the ATM program
public class ATMSystem {
    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance of $500
        BankAccount account = new BankAccount(500);
        
        // Create an ATM object and connect it to the BankAccount
        ATM atm = new ATM(account);
        
        // Display the ATM menu
        atm.displayMenu();
    }
}