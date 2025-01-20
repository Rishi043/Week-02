// Creating Class with name Product to manage product details  

class Product { 

    // Instance variables 
	
    private String productName;
    private double price;

    // Class variable for the total number of products 
	
    private static int totalProducts = 0;

    // Parameterized Constructor  
	
    public Product(String productName, double price) 
	{
        this.productName = productName;
        this.price = price;
        totalProducts++;         // Increment total products when a new product is created
    }

    // Instance method  
	
    public void displayProductDetails() 
	{
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

// Creating Class with name ProductInventory to test Product functionality
public class ProductInventory {
    public static void main(String[] args) {
      
        Product product1 = new Product("Laptop", 999);
        Product product2 = new Product("Smartphone", 699);

        // Displaying product details (Using Instance Method)
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();


        // Displaying the total number of products (Using Class Method)
        System.out.println("\nDisplaying Total Products:");
        Product.displayTotalProducts();
    }
}
