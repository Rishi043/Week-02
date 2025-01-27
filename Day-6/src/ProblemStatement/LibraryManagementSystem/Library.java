package ProblemStatement.LibraryManagementSystem;

// Importing required packages
import java.util.ArrayList;
public class Library {
    public static void main(String[] args){
        // Creating an ArrayList of LibraryItem
        ArrayList<LibraryItem> items = new ArrayList<>();

        //create objects of Book, DVD and Magazine and add them to the ArrayList
        Book book = new Book(101,"Action Kamen", "Shikaru");
        items.add(book);

        DVD dvd = new DVD(112,"Action Kamen", "Shikaru");
        items.add(dvd);

        Magazine magazine = new Magazine(101,"Rolling Stone","Jann Wenner");
        items.add(magazine);

        //Iterate through the ArrayList and call the getItemDetails() method for each item
        for(LibraryItem item : items){
            item.getItemDetails();
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem("Shinchan");
                } else {
                    System.out.println("Item is not available for reservation.");
                }
            }
            System.out.println("----------------------------------------");
        }


    }
}
