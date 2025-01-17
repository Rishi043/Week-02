import java.util.Scanner;

// Creating Class with name CartItem for an item in the shopping cart
class CartItem {
    String itemName;        // Name of an item
    double price;           // Price of an item
    int quantity;           // Quantity of the item

    // Constructor to initialize a CartItem with name, price, and quantity
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate the total price of the item in the cart
    public double getTotalPrice() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + String.format("%.2f", getTotalPrice()));
    }
}

// Creating Main class with name ShoppingCart 
public class ShoppingCart {
    
    CartItem cartItem;  // A single item in the cart (datamember)

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cartItem = new CartItem(itemName, price, quantity);
        System.out.println("Added item: " + itemName);
    }

    // Method to display the item in the cart
    public void displayItems() {
        if (cartItem == null) {
            System.out.println("Empty Cart!!!!");
        } else {
            cartItem.displayItem();
        }
    }

    // Method to calculate and display the total cost of the cart
    public void displayTotalCost() {
        if (cartItem == null) {
            System.out.println("Total cost: $0.00");
        } else {
            System.out.println("Total cost: " + String.format("%.2f", cartItem.getTotalPrice()));
        }
    }

    // Method to remove the item from the cart
    public void removeItem() {
        if (cartItem != null) {
            System.out.println("Removed item: " + cartItem.itemName);
            cartItem = null;
        } else {
            System.out.println("No items in the cart to remove.");
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();  // Create an instance of ShoppingCart

        // Adding items to the cart
        cart.addItem("Apple", 0.99, 3);
        cart.addItem("Banana", 0.59, 5);

        // Displaying the items in the cart
        cart.displayItems();

        // Displaying the total cost of the items in the cart
        cart.displayTotalCost();

        // Removing the item from the cart
        cart.removeItem();

        // Displaying the items again after removal
        cart.displayItems();
    }
}
