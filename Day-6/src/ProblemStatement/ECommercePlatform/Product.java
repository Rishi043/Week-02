package ProblemStatement.ECommercePlatform;

//Create an abstract class Product that implements Taxable interface
abstract class Product {
    //initialize the variables
    private final int PRODUCTID;
    private String name;
    private int price;

    //getter methods
    public int getPRODUCTID() {
        return PRODUCTID;
    }

    //getter and setter methods  for price
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    //getter and setter methods for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Create a constructor with id, name, and price
    Product(int productId, String name, int price){
        this.PRODUCTID = productId;
        this.name = name;
        this.price = price;
    }

    //Create an abstract method calculateDiscount
    abstract void calculateDiscount();

    //Create a method display
    public void display(){
        System.out.println("Product ID: "+PRODUCTID);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}