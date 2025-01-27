package ProblemStatement.LibraryManagementSystem;

// Book class extends LibraryItem and implements Reservable interface
public class Book extends LibraryItem implements Reservable {
    private boolean isReserve;
    public Book(int itemid, String title, String author) {
        super(itemid, title, author);
        this.isReserve = false;
    }

    // getLaonDuration method from Reservable interface
    @Override
    public int getLaonDuration() {
        return 15;
    }

    // getItemDetails method from LibraryItem class
    @Override
    public void getItemDetails(){
        super.getItemDetails();
        System.out.println("Magazine can be rented for: "+ getLaonDuration());
    }

    // reserveItem method from Reservable interface
    public void reserveItem(String borrowerName){
        if(isReserve){
            System.out.println("Magazine is already reserved!");
        }
        else{
            System.out.println("Magazine reserved by: "+ borrowerName);
        }
    }

    // checkAvailability method from Reservable interface
    public boolean checkAvailability(){
        return !isReserve;
    }

}
