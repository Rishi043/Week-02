import java.util.*;

// Creating Customer class to manage orders associated with a customer
class Customer {
    private String customerName; // Name of the customer
    private ArrayList<Order> order; // List of orders placed by the customer

    // Constructor to initialize the customer name
    public Customer(String customerName) {
        this.customerName = customerName;
        this.order = new ArrayList<>();
    }

    // Method to add a new order
    public void addOrder(String orderN) {
        Order ord = new Order(orderN); // Creating a new Order object
        order.add(ord); // Adding the order to the customer's order list
    }

    // Method to add a product to a specific order
    public void set(String orderNaam, String productNaam) {
        for (Order ord : order) {
            if (orderNaam.equals(ord.orderName)) { // Check if the order name matches
                ord.addProduct(productNaam); // Add product to the matched order
            }
        }
    }

    // Method to display customer details along with their orders and products
    public void showDetail() {
        System.out.println("Name of customer: " + customerName); // Display customer name
        for (Order ord : order) {
            System.out.println("Name of the order: " + ord.orderName); // Display order name
            System.out.println("Products:");
            ord.showDetailProduct(); // Display products in the order
            System.out.println(); // Line break for readability
        }
    }
}

// Creating Order class to manage products within an order
class Order {
    public String orderName; // Name of the order
    private ArrayList<Product> product; // List of products in the order

    // Constructor to initialize the order name
    public Order(String orderName) {
        this.orderName = orderName;
        this.product = new ArrayList<>();
    }

    // Method to add a new product to the order
    public void addProduct(String productN) {
        Product p = new Product(productN); // Creating a new Product object
        product.add(p); // Adding the product to the order's product list
    }

    // Method to display details of products in the order
    public void showDetailProduct() {
        for (Product cou : product) {
            System.out.println("Name of the product: " + cou.productName); // Display product name
        }
    }
}

// Creating Product class to represent individual products
class Product {
    public String productName; // Name of the product

    // Constructor to initialize the product name
    public Product(String productName) {
        this.productName = productName;
    }
}

// Main class to test the functionality of the Customer, Order, and Product classes
public class EcommerceCode {
    public static void main(String args[]) {
        // Creating customer instances
        Customer c1 = new Customer("Dev");
        Customer c2 = new Customer("Aditya");

        // Adding orders to customer c1
        c1.addOrder("Fruit order");
        c1.addOrder("Electronics order");

        // Adding products to orders for customer c1
        c1.set("Fruit order", "Apple");
        c1.set("Fruit order", "Mango");
        c1.set("Fruit order", "Pineapple");

        c1.set("Electronics order", "Fan");
        c1.set("Electronics order", "AC");

        // Adding orders to customer c2
        c2.addOrder("Household order");
        c2.addOrder("Electronics order");

        // Adding products to orders for customer c2
        c2.set("Household order", "Spoon");
        c2.set("Household order", "Fork");
        c2.set("Household order", "Knife");

        c2.set("Electronics order", "Fan");
        c2.set("Electronics order", "AC");

        // Displaying details for both customers
        c1.showDetail();
        c2.showDetail();
    }
}
