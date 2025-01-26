package ProblemStatement.ECommercePlatform;

//Create a class Electronic that extends Product and implements Texable interface
public class Electronic extends Product implements Texable {
    private double discount;
    private double discountValue;

    //Create a constructor with id, name, price, and discount
    Electronic(int id, String name, int price, double discount){
        super(id ,name, price);
        this.discount = discount;
    }

    //Override the calculateTax method
    @Override
    public double calculateTax(){
        return (getPrice()+(getPrice()*0.25));
    }

    //Override the getTaxDetails method
    @Override
    public void getTaxDetails(){
        System.out.println("Applied Tax: 25%");
    }

    //Override the calculateDiscount method
    @Override
    public void calculateDiscount(){
        discountValue = ((discount*calculateTax())/100.00);
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

    //Implement the finalPrice method
    public void finalPrice(){
        int price = getPrice();
        System.out.println("Final Price : "+ (int)(calculateTax()-discountValue));
    }
}