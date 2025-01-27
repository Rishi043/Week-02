package ProblemStatement.OnlineFoodDeliverySystem;

// NonVeg class extends FoodItem and implements Discountable interface
public class NonVeg extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discountRate;

    //create a constructor with parameters itemName, price, quantity, additionalCharge, discountRate
    public NonVeg(String itemName, double price, int quantity, double additionalCharge, double discountRate) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discountRate = discountRate;
    }

    //override the methods of the Discountable interface
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity();
    }

    //override the methods of the Discountable interface
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * discountRate / 100;
    }

    //override the getItemDetails method of the FoodItem class
    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Additional Charge per Unit :- " + additionalCharge);
        System.out.println("Discount :- " + applyDiscount());
        System.out.println("Final Price :- " + (calculateTotalPrice() - applyDiscount()));
    }
}