package ProblemStatement.OnlineFoodDeliverySystem;

// VegItem class extends FoodItem class and implements Discountable interface
public class VegItem extends FoodItem implements Discountable {
    private double discountRate;

    //create a constructor with parameters itemName, price, quantity, discountRate
    public VegItem(String itemName, double price, int quantity, double discountRate) {
        super(itemName, price, quantity);
        this.discountRate = discountRate;
    }

    //override the calculateTotalPrice method
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    //override the applyDiscount method
    @Override
    public double applyDiscount() {
        return (calculateTotalPrice() * discountRate) / 100;
    }

    //override the getItemDetails method
    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Discount :- " + applyDiscount());
        System.out.println("Final Price :- " + (calculateTotalPrice() - applyDiscount()));
    }
}
