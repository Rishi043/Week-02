import java.util.*;

// Creating class BankAccount to model bank accounts for customers
class BankAccount {
    private String accountNumber; // Account number of the bank account
    private double bankBalance; // Current balance in the bank account

    // Constructor to initialize BankAccount with an account number
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.bankBalance = 0.0; // Initializing balance to 0.0
    }

    // Method to show the current balance
    public double showBalance() {
        return bankBalance;
    }

    // Method to deposit a specified amount into the account
    public void deposit(int amount) {
        if (amount > 0) {
            bankBalance += amount; // Adding the amount to the bank balance
        } else {
            System.out.println("Please enter the valid amount");
        }
    }

    // Method to withdraw a specified amount from the account
    public void withdrawl(int amount) {
        if (bankBalance > amount && amount > 0) {
            bankBalance -= amount; // Deducting the amount from the bank balance
        } else {
            System.out.println("Withdraw unsuccessful"); // Handling invalid withdrawal
        }
    }

    // Method to get the account number of the bank account
    public String getAccountNumber() {
        return accountNumber;
    }
}

// Creating class Customer to represent customers with multiple bank accounts
class Customer {
    private String customerName; // Name of the customer
    private String customerId; // ID of the customer
    private ArrayList<BankAccount> Accounts; // List of bank accounts owned by the customer

    // Constructor to initialize a Customer with a name and ID
    public Customer(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.Accounts = new ArrayList<>(); // Initializing the accounts list
    }

    // Method to view the balance of all accounts owned by the customer
    public void viewBalance() {
        for (BankAccount account : Accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + " Balance: " + account.showBalance());
        }
    }

    // Method to open a new account for the customer
    public void openAccount(BankAccount account) {
        Accounts.add(account); // Adding the account to the customer's account list
    }

    // Method to display all the customer's accounts
    public void showBanks() {
        for (BankAccount account : Accounts) {
            System.out.println(account);
        }
    }

    // Method to get the customer's name
    public String getCustomerName() {
        return customerName;
    }
}

// Creating class Bank to represent a bank with multiple accounts
class Bank {
    private String bankName; // Name of the bank
    private ArrayList<BankAccount> Accounts; // List of bank accounts in the bank

    // Constructor to initialize the Bank with a name
    public Bank(String bankName) {
        this.bankName = bankName;
        this.Accounts = new ArrayList<>(); // Initializing the accounts list
    }

    // Method to open a new account for a customer
    public BankAccount openAccount(Customer customer) {
        String accountNumber = "ACC0000" + (Accounts.size() + 1); // Generating a unique account number
        BankAccount newAccount = new BankAccount(accountNumber); // Creating a new bank account
        customer.openAccount(newAccount); // Associating the account with the customer
        Accounts.add(newAccount); // Adding the account to the bank's account list
        System.out.println("New account opened for " + customer.getCustomerName() + " with Account Number: " + accountNumber);
        return newAccount;
    }

    // Method to get the bank's name
    public String getBankName() {
        return bankName;
    }
}

// Main class to test the Banking system functionality
public class BankingCode {
    public static void main(String args[]) {
        // Creating instances of banks
        Bank bank1 = new Bank("DEV Bank of India");
        Bank bank2 = new Bank("ADITYA Bank of India");
        Bank bank3 = new Bank("BANK of India");

        // Creating instances of customers
        Customer customer1 = new Customer("Devi", "C123");
        Customer customer2 = new Customer("Dev", "C124");
        Customer customer3 = new Customer("Ram", "C125");
        Customer customer4 = new Customer("Raya", "C126");

        // Opening accounts for customers in different banks
        BankAccount account1 = bank1.openAccount(customer1);
        BankAccount account2 = bank2.openAccount(customer2);
        BankAccount account3 = bank3.openAccount(customer3);
        BankAccount account4 = bank1.openAccount(customer4);

        // Depositing money into accounts
        account1.deposit(500);
        account2.deposit(1000);
        account3.deposit(1500);
        account4.deposit(200);

        // Withdrawing money from accounts
        account1.withdrawl(200);
        account2.withdrawl(150);
        account3.withdrawl(100);
        account4.withdrawl(50);

        // Checking balances for each customer's accounts
        System.out.println("\n" + customer1.getCustomerName() + "'s Accounts:");
        customer1.viewBalance();

        System.out.println("\n" + customer2.getCustomerName() + "'s Accounts:");
        customer2.viewBalance();

        System.out.println("\n" + customer3.getCustomerName() + "'s Accounts:");
        customer3.viewBalance();

        System.out.println("\n" + customer4.getCustomerName() + "'s Accounts:");
        customer4.viewBalance();
    }
}
