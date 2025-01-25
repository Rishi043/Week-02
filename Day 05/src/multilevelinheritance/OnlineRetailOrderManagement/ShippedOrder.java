package multilevelinheritance.OnlineRetailOrderManagement;

public class ShippedOrder extends Order {
    int trackingNumber;
    void getOrderStatus() {
        // Print order ID, date, and tracking number
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

