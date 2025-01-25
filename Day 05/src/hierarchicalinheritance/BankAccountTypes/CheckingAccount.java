package hierarchicalinheritance.BankAccountTypes;

public class CheckingAccount extends BankAccount{
    private int withdrawalLimit;

    //constructor
    public CheckingAccount(String accountNumber, int balance , int withdrawalLimit) {
        super(accountNumber, balance );
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    //create a method displayDetails() to display the details of the account number, balance and withdrawal limit.
    public void displayDetails() {
        super.displayDetails();            // calling the displayDetails() of the parent class
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
