package ProblemStatement.BankingSystem;

//created SavingAccount class which extends BankAccount and implements Loanable interface
public class SavingAccount extends BankAccount implements Loanable{
    //private variables
    private double interestRate;
    private double overdraftLimit;

    //created constructor for SavingAccount
    public SavingAccount(int accountNumber, String holderName, double balance,double interestRate, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
        this.interestRate = interestRate;
    }

    //overridden methods from BankAccount and Loanable interface
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    //overridden methods from BankAccount and Loanable interface
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate :- " + interestRate + "%");
        System.out.println("Interest :- " + calculateInterest());
        System.out.println("Loan Eligibility :-" + calculateLoanEligibility());
    }

    //overridden methods from BankAccount and Loanable interface
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application submitted for amount :- " + amount);
    }

    //overridden methods from BankAccount and Loanable interface
    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit;
    }
}