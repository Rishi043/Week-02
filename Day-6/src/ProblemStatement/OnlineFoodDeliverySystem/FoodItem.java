package ProblemStatement.OnlineFoodDeliverySystem;

// Abstract class FoodItem
public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters for getname
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Getters and Setters for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters and Setters for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // create a method to get item details
    public void getItemDetails() {
        System.out.println("Item Name :- " + itemName);
        System.out.println("Price per Unit :- " + price);
        System.out.println("Quantity :- " + quantity);
    }
}
