import java.util.Scanner; 

class Book {
    String title;
	String author;
	int price; 
	
	Book(){                              // default constructor
	title = "It Ends With Us";
	author = "Colleen Hoover";
	price = 129;
	} 
	
	Book (String title, String author, int price){
	
	this.title = title;
	this.author = author; 
	this.price = price;     // using the this keyword
	
	}
	
	void display()
	{
	System.out.println("Title: " + title + " By Author: " + author + " at Price: " + price);
	}
} 

public class BookDetails{
    public static void main(String args[]){
		 Scanner scanner = new Scanner(System.in); // Creating a Scanner object to take user input

        System.out.println("Enter title: ");
        String title1 = scanner.nextLine();                              // Reading title input
		
        System.out.println("Enter author: ");
        String author1 = scanner.nextLine();                            // Reading author input 
		
        System.out.println("Enter price: ");
        int price1 = scanner.nextInt();                                  // Reading price input
		
		Book book1 = new Book();                           // object for default constructor		
                                                             
        Book book2 = new Book(title1, author1, price1);   // Creating Book objects using user input
		
		System.out.println();
		System.out.println("Book Details:"); 
		book1.display(); 
		book2.display(); 
		
	}
}
		
	
	