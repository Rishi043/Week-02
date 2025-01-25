package multilevelinheritance.OnlineRetailOrderManagement;

public class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    void getOrderStatus() {
        // Print order ID, date, tracking number, and delivery date
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
