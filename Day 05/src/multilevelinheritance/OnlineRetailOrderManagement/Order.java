package multilevelinheritance.OnlineRetailOrderManagement;

public class Order {
    int orderId;
    String orderDate;

    void getOrderStatus() {
        // Print order ID and date
        System.out.println("Order Id: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

