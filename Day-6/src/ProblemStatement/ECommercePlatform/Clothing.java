package ProblemStatement.ECommercePlatform;

//Create a class Clothing that extends Product and implements Texable interface
public class Clothing extends Product implements Texable {
    private double discount;
    private double discountValue;

    //Create a constructor with id, name, price, and discount
    Clothing(int id, String name, int price, double discount){
        super(id ,name, price);
        this.discount = discount;

    }

    //Override the calculateDiscount method
    @Override
    public void calculateDiscount() {
        discountValue =  (calculateTax()*discount)/100;
    }

    //Override the calculateTax method
    @Override
    public double calculateTax() {
        return getPrice()+(getPrice()*.25);
    }

    //Override the display method
    @Override
    public void display(){
        super.display();
        getTaxDetails();
        System.out.println("Discount: "+discount);
        finalPrice();
        System.out.println("---------------------------------------------------------------------");

    }

    //Override the getTaxDetails method
    @Override
    public void getTaxDetails() {
        System.out.println("Applied Tax : 25%");
    }

    //Implement the finalPrice method
    public void finalPrice(){
        int price = getPrice();
        System.out.println("Final Price : "+ (int)(calculateTax()-discountValue));
    }

}
