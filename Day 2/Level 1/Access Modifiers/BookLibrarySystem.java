// Parent class Book

class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Parametrized Constructor to initialize book details 
	
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author's name 
    public String getAuthor() {
        return author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) 
	{
        this.author = author;
    }
}

// Subclass EBook that inherits from Book 

class EBook extends Book 
{
    // Constructor to initialize EBook details
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);                            
		// Using the constructor from Book
    }

    // Method to display the EBook details
    public void displayEBookDetails() 
	{
        System.out.println("ISBN: " + ISBN); // Public field accessible
        System.out.println("Title: " + title); // Protected field accessible
        System.out.println("Author: " + getAuthor()); // Private field accessed via public method
    }
}

// Main class 

public class BookLibrarySystem 
{
    public static void main(String[] args) 
	{
        // Creating a Book object
        Book book1 = new Book("123-456-789", "Java", "CD Martin");

        System.out.println("Book 1 Details:");
        System.out.println("ISBN: " + book1.ISBN);
        System.out.println("Title: " + book1.title);          // Accessible because it's protected
        System.out.println("Author: " + book1.getAuthor());

        // Modifying the author's name
        book1.setAuthor("Sir CD Martin");
        System.out.println("Updated Author: " + book1.getAuthor());

        // Creating an EBook object
        EBook ebook1 = new EBook("987-654-321", "Java Programming", "John");

        System.out.println("\nEBook 1 Details:");
        ebook1.displayEBookDetails();
    }
}
