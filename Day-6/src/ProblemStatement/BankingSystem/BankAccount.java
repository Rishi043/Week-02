package ProblemStatement.BankingSystem;

//Create an abstract class BankAccount with the following attributes:
public abstract class BankAccount {
    //instance variables
    private final int ACCOUNTNUMBER;
    private String holderName;
    private double balance;

    //getters for account number
    public int getACCOUNTNUMBER() {
        return ACCOUNTNUMBER;
    }

    //getters and setters for holder name and balance
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //create a constructor with the following parameters:
    BankAccount(int ACCOUNTNUMBER, String holderName, double balance){
        this.ACCOUNTNUMBER = ACCOUNTNUMBER;
        this.holderName = holderName;
        this.balance = balance;
    }

    //create a method to deposit an amount
    void deposit(double amount){
        if(amount <=0) {
            System.out.println("Amount must be greater than zero!");
        }
        else{
            balance += amount;
            System.out.println(amount + " Deposited." + " Current Balance : "+ this.balance);
        }
    }

    //create a method to withdraw an amount
    void withdraw(double amount){
        if(balance<=0){
            System.out.println("Insufficiant balance");
        }
        else{
            if(amount>balance){
                System.out.println("Amount is greater than current balance");
            }
            else{
                balance -= amount;
                System.out.println(amount + " Withdrawn." + " Current Balance : "+ this.balance);
            }
        }
    }

    //create an abstract method calculateInterest
    abstract double calculateInterest();

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number :- " + ACCOUNTNUMBER);
        System.out.println("Name of Account Holder :- " + holderName);
        System.out.println("Account Balance :- " + balance);
    }
}