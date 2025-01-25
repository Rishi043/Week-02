package hierarchicalinheritance.BankAccountTypes;


    //Create a class BankManagement with the main method
    public class BankManagement {
        public static void main(String[] args) {

            //creating obj BankAccount class
            BankAccount account1 = new BankAccount("67486", 2200);
            //displaying details of account1
            account1.displayDetails();

            //creating obj SavingsAccount class
            SavingsAccount account2 = new SavingsAccount("54938", 5000, 5);

            //displaying details of account2
            account2.displayDetails();

            //create obj CheckingAccount class
            CheckingAccount account3 = new CheckingAccount("745663", 6000, 500);

            //displaying details of account3
            account3.displayDetails();

            //creating obj FixedDepositAccount class
            FixedDepositAccount account4 = new FixedDepositAccount("35456", 900, 12);

            //displaying details of account4
            account4.displayDetails();
        }
    }

