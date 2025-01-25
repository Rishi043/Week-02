package hierarchicalinheritance.BankAccountTypes;

public class FixedDepositAccount extends BankAccount{
    private int compoundRate;

    //constructor
    public FixedDepositAccount(String accountNumber, int balance, int compoundRate) {
        super(accountNumber, balance );
        this.compoundRate = compoundRate;
    }
    @Override
    //create a method displayDetails() to display the details of the account number, balance and compound rate.
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Compound Rate: " + compoundRate);
    }
}
