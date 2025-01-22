/* Create a Book class to manage library books with the following features:
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
Final:
Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
Verify if an object is an instance of the Book class before displaying its details.

*/

import java.util.Scanner;

// Creating Class with name Book
public class Book {

    // Creating static variable libraryName shared across all books
    private static String libraryName = "City Library";

    // Creating instance variables
    private final String isbn; // Final variable for unique identifier
    private String title;
    private String author;

    // Constructor (Parameterized)
    public Book(String title, String author, String isbn) { 
	
        // Using this to resolve ambiguity between instance and parameter variables
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details using instanceof
    public void display() {
        if (this instanceof Book) {  // Check if the object is an instance of the Book class
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first book
        System.out.println("Enter details for the book:"); 
		
        System.out.print("Title: "); 
        String title1 = scanner.nextLine(); 
		
        System.out.print("Author: ");
        String author1 = scanner.nextLine(); 
		
        System.out.print("ISBN: ");
        String isbn1 = scanner.nextLine();

        // Creating book objects
        Book book1 = new Book(title1, author1, isbn1);

        // Displaying library name
        System.out.println("\nLibrary Information:");
        Book.displayLibraryName();

        // Displaying details of the books using processObject
        System.out.println("\nBook Details:");
		book1.display();

        
        scanner.close();
    }
}
