package ProblemStatement.BankingSystem;

// import packages for ArrayList
import java.util.ArrayList;

// Bank class
public class Bank {
    public static void main(String[] args) {
        // Creating objects of SavingAccount and CurrentAccount
        BankAccount savingsAccount = new SavingAccount(336757676, "peppa", 5000, 3.5,5000);
        BankAccount currentAccount = new CurrentAccount(483646346, "Doraemon", 10000, 1 ,5000);

        // Creating an ArrayList of BankAccount
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        // Displaying the details of the accounts
        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println();
            System.out.println("--------------------------------------------------------------");
        }
    }
}