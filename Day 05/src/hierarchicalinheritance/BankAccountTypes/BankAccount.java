package hierarchicalinheritance.BankAccountTypes;

public class BankAccount {
    private String accountNumber;
    private int balance;

    //constructor
    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //Create a method displayDetails() to display the details of the account number and balance.
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}

