import java.util.Scanner;

// Creating Class with name Book to manage details
class Book {
   
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized Constructor 
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow the book
    public void borrowBook() 
	{
        // Checking if the book is available
        if (isAvailable) 
		{
            // Marking the book as unavailable
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } 
		else {
            System.out.println("The book \"" + title + "\" is currently unavailable.");
        }
    }

    // Method to display details of the book
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Unavailable"));
    }
}

// Creating Class with name LibraryBookSystem to handle book input and operations
public class LibraryBookSystem {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter book details
        System.out.println("Enter book title:");
        String title = scanner.nextLine();

        System.out.println("Enter book author:");
        String author = scanner.nextLine();

        System.out.println("Enter book price:");
        double price = scanner.nextDouble();

        System.out.println("Is the book available? (true/false):");
        boolean isAvailable = scanner.nextBoolean();

        // Creating a book object with user-provided details
        Book userBook = new Book(title, author, price, isAvailable);

        // Displaying the details of the book
        System.out.println("\nBook Details:");
        userBook.displayBookDetails();

        // Attempting to borrow the book
        System.out.println("\nBorrowing the Book:");
        userBook.borrowBook();

        // Displaying the details of the book after borrowing
        System.out.println("\nBook Details After Borrowing:");
        userBook.displayBookDetails();

        // Closing the scanner object
        scanner.close();
    }
}
