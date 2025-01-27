package ProblemStatement.LibraryManagementSystem;

//Create an interface Reservable with the following methods
public interface Reservable {
    //void reserveItem(String borrowerName) - This method should reserve the item for the borrower
    void reserveItem(String borrowerName) ;

    //void checkAvailability() - This method should check the availability of the item
    boolean checkAvailability();

}
