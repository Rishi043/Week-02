package ProblemStatement.LibraryManagementSystem;

// Magazine class extends LibraryItem and implements Reservable interface
public class Magazine extends LibraryItem implements Reservable{
    private boolean isReserve;

    // Constructor
    public Magazine(int itemid, String title, String editor) {
        super(itemid, title, editor);
        this.isReserve = false;
    }

    // overriding abstract methods from LibraryItem
    @Override
    public int getLaonDuration() {
        return 6;
    }

    // Implementing abstract methods from LibraryItem
    @Override
    public void getItemDetails(){
        super.getItemDetails();
        System.out.println("Magazine can be rented for: "+ getLaonDuration());
    }

    //Overriding reserveItem method from Reservable interface
    @Override
    public void reserveItem(String borrowerName){
        if(isReserve){
            System.out.println("Magazine is already reserved!");
        }
        else{
            System.out.println("Magazine reserved by: "+ borrowerName);
        }
    }

    //Overriding checkAvailability method from Reservable interface
    @Override
    public boolean checkAvailability(){
        return !isReserve;
    }

}