class Book {
    String title, author;
    int price;

    // Constructor
    Book(String title, String author, int price)   // used to initialise the objects
	{
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display Book details
    void displayDetails() 
	{
        System.out.println(" Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

// Main class to demonstrate Book details 

public class BookDetails {
    public static void main(String[] args) {
		
        // Creating an object of Book class 
        Book book = new Book("All of us are DEAD", "JK ROWLING", 1000);
        
      
        book.displayDetails();

    }
}