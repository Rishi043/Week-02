import java.util.*;

// Book Class
class Book {
    private String title;  // Title of the book
    private String author; // Author of the book

    // Constructor to initialize title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter method to get the title of the book
    public String getTitle() {
        return title;
    }

    // Getter method to get the author of the book
    public String getAuthor() {
        return author;
    }

    // Method to print book details
    public void print() {
        System.out.println("Book: " + title + "\nAuthor: " + author + "\n");
    }
}

// Library Class
class Library {
    private String name; // Name of the library
    private ArrayList<Book> books; // List to store books in the library

    // Constructor to initialize library name and book list
    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book1) {
        books.add(book1);
    }

    // Method to display all books in the library
    public void display() {
        System.out.println("The books in the " + name + " Library are: ");
        for (Book s : books) {
            System.out.println(s.getTitle()); // Display book titles
        }
    }
}

// Main Class
public class LibraryManagementCode {
    public static void main(String args[]) {
        // Creating objects of Book
        Book book1 = new Book("Rayagan", "Dev"); // Book with title "Rayagan" and author "Dev"
        book1.print(); // Print book1 details

        Book book2 = new Book("RashmiRathi", "Karna"); // Book with title "RashmiRathi" and author "Karna"
        book2.print(); // Print book2 details

        // Creating libraries
        Library library1 = new Library("Takshashila"); // Library named "Takshashila"
        Library library2 = new Library("Indi"); // Library named "Indi"

        // Adding books to libraries
        library1.addBook(book1); // Adding book1 to library1
        library2.addBook(book2); // Adding book2 to library2

        // Displaying books in each library
        library1.display(); // Display books in library1
        library2.display(); // Display books in library2
    }
}
