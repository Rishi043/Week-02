// Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.
import java.util.Scanner; 

class Item {
    int itemCode;
	String itemName; 
	double price; 
	
	// Constructor to initialize the objects 
	
	Item (int itemCode, String itemName, double price) 
	{
	    this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		
	} 
	
    void displayDetails() 
	{
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    } 
	
	
	 // Method to calculate the total cost for a given quantity
	 
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
} 

public class ItemDetails {  

public static void main(String [] args) {
	
	    Item item = new Item(101, "Shampoo", 350);  

        // Taking quantity input from the user 
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt() ;
		
		// Displaying item details 
		 
        System.out.println("Item Details:");
        item.displayDetails(); 
		
		//  displaying the total cost for the given quantity 

        System.out.println("Total cost for quantity " + quantity + ": " + item.calculateTotalCost(quantity));
 
 
        // Closing the Scanner obj 
        scanner.close();
    }
}

