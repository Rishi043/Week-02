package multilevelinheritance.OnlineRetailOrderManagement;

public class OnlineOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder order1 = new DeliveredOrder();
        order1.orderId = 101;
        order1.orderDate = "Jan 1";
        order1.trackingNumber = 10234455;
        order1.deliveryDate = "Jan 26";

        System.out.println("--- Order Details ---");
        order1.getOrderStatus();

    }
}

