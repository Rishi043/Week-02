// Creating Class with name BankAccount 

public class BankAccount {

    // Creating static variable bankName 
    private static String bankName = "ICICI Bank";

    // Creating static variable totalAccounts 
    private static int totalAccounts = 0;
	
    // Creating final variable accountNumber 
    private final int accountNumber;

    // Creating instance variable accountHolderName
    private String accountHolderName;

    // Constructor (Parameterized) 
    public BankAccount(String accountHolderName, int accountNumber) 
	{ 
        // Using this keyword to resolve ambiguity between instance and parameter variables
        this.accountHolderName = accountHolderName;       
        this.accountNumber = accountNumber;

        // Incrementing the total number of accounts
        totalAccounts++;
    }

    // Creating static method getTotalAccounts 
	
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Creating method to display account details 
	
    public void display() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);

    }

    // Creating static method to set the bank name (optional utility method)
    public static void setBankName(String name) 
	{
        bankName = name;    // to change the bank name in static method
    }

    public static void main(String[] args) 
	{
        // Setting the bank name (optional demonstration)
        // BankAccountSystem.setBankName("Future Bank");

        // Creating objects of Class 
		
        BankAccount account1 = new BankAccount("Goldy Brar", 1011); 
		BankAccount account2 = new BankAccount("Lawrence Bishnoi", 1021); 
		
		
        // Creating a new object to check with instanceof
        Object obj = new BankAccount("Test User", 1031);

        // Using instanceof operator on the new object
        if (obj instanceof BankAccount) {
            // Casting obj to BankAccount type
            BankAccount account = (BankAccount) obj;
            account.display();
        } 
		else 
		{
            System.out.println("Invalid account object.");
        }

        // Displaying details of the accounts
        account1.display();
		account2.display();

        // Displaying the total number of accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());     // use class name to return static method
    }
}
