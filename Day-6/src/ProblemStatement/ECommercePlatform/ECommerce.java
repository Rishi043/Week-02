package ProblemStatement.ECommercePlatform;

//Importing the required packages
import java.util.ArrayList;

//Main class
public class ECommerce {
    public static void main(String[] args){
        //Creating an ArrayList of type Product
        ArrayList<Product> products = new ArrayList<>();

        //Creating objects of Electronic, Groceries and Clothing classes and adding them to the ArrayList
        Electronic electronic = new Electronic(1,"Television", 2500, 35);
        products.add(electronic);

        Groceries groceries = new Groceries(101,"Onion", 100, 20);
        products.add(groceries);

        Clothing clothing = new Clothing(112,"Crop top", 350, 15);
        products.add(clothing);

        //Run a loop to calculate the discount and display the details of each product
        for(Product product : products){
            product.calculateDiscount();
            product.display();
        }

    }

}
