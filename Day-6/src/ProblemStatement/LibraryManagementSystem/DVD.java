package ProblemStatement.LibraryManagementSystem;

public class DVD extends LibraryItem implements Reservable{
    private boolean isReserve;

    // Constructor
    public DVD(int itemid, String title, String author) {
        super(itemid, title, author);
        this.isReserve = false;
    }

    // overriding the getLaonDuration method
    @Override
    public int getLaonDuration() {
        return 10;
    }

    // overriding the getItemDetails method
    @Override
    public void getItemDetails(){
        super.getItemDetails();
        System.out.println("DVD can be rented for: "+ getLaonDuration());
    }

    // overriding the reserveItem method
    @Override
    public void reserveItem(String borrowerName){
        if(isReserve){
            System.out.println("DVD is already reserved!");
        }
        else{
            System.out.println("DVD reserved by: "+ borrowerName);
        }
    }

    // overriding the checkAvailability method
    @Override
    public boolean checkAvailability(){
        return !isReserve;
    }

}
