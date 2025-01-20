// Parent class BankAccount

class BankAccount {
    public String accountNumber;   // Public variable
    protected String accountHolder; // Protected variable
    private double balance;         // Private variable

    // Constructor 
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } 
		else 
		{
            System.out.println("Invalid balance! Balance cannot be negative.");
        }
    }
}

// Subclass SavingsAccount that inherits from BankAccount
class SavingsAccount extends BankAccount 
{
    // Constructor to initialize SavingsAccount details 
	
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {  
	
	// Using the constructor from BankAccount
        super(accountNumber, accountHolder, balance);                          
    }

    // Method to display the savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber); // Public field accessible
        System.out.println("Account Holder: " + accountHolder); // Protected field accessible
        System.out.println("Balance: " + getBalance()); // Private field accessed via public method
    }
}

// Main class 

public class BankAccountManagement 
{
    public static void main(String[] args) 
	{
        // Creating a BankAccount object
        BankAccount account1 = new BankAccount("123456789", "Aloo", 1000);

        System.out.println("Bank Account Details:");
        System.out.println("Account Number: " + account1.accountNumber);
        System.out.println("Account Holder: " + account1.accountHolder);  // Protected member access
        System.out.println("Balance: " + account1.getBalance());

        // Modifying the balance using public method
        account1.setBalance(1500);
        System.out.println("Updated Balance: " + account1.getBalance());

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Johnn", 2000);

        System.out.println("\nSavings Account Details:");
        savingsAccount.displaySavingsAccountDetails();
    }
}
