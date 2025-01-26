package ProblemStatement.BankingSystem;

//Creating CurrentAccount class which extends BankAccount and implements Loanable
public class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate;
    private double overdraftLimit;

    //Parameterized constructor
    public CurrentAccount(int accountNumber, String holderName, double balance,double interestRate, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
        this.overdraftLimit = overdraftLimit;
    }

    //Overriding the methods of BankAccount and Loanable interface
    @Override
    public double calculateInterest() {
        return 0;
    }

    //Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate :- " + interestRate + "%");
        System.out.println("Interest :- " + calculateInterest());
        System.out.println("Loan Eligibility :- " + calculateLoanEligibility());
    }

    //Overriding the applyForLoan method
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application submitted for amount :- " + amount);
    }

    //Overriding the calculateLoanEligibility method
    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit;
    }
}