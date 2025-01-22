//Create a class Product to initialize a Product details. 

public class Product {
    //Create data members to store details.
    static float discount = 5.0f;
    private String productName;
    final int productID;
    private int price;
    private int quantity;

    //Create a method to assign new discount value.
    static void updateDiscount(float newDiscount){
        discount = newDiscount;
    }

    //Constructor to initialize values using this keyword
    Product(String productName, int price, int quantity, int productID){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    //Display the details.
    void display(){
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Product ID : " + productID);
        System.out.println("Discount  : " + discount);
    }
}
