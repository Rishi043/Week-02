package hierarchicalinheritance.BankAccountTypes;

    //Create a class SavingsAccount that extends BankAccount with the following attributes and methods:
    public class SavingsAccount extends BankAccount{
        private int interestRate;

        //constructor
        public SavingsAccount(String accountNumber, int balance, int interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }
        @Override
        //create a method displayDetails() to display the details of the account number, balance and interest rate.
        public void displayDetails() {
            super.displayDetails();                    // calling the displayDetails() of the parent class

            System.out.println("Interest Rate: " + interestRate + "%");
        }
    }

