package ProblemStatement.OnlineFoodDeliverySystem;

//import the required classes
import java.util.ArrayList;
public class OnlineFoodDelivery {
    public static void main(String[] args) {
        //create an ArrayList of FoodItem
        ArrayList<FoodItem> order = new ArrayList<>();

        //add the VegItem and NonVeg objects to the ArrayList
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 250, 2, 10);
        order.add(vegItem);

        FoodItem nonVegItem = new NonVeg("Chicken Butter Masala", 300, 3, 50, 5);
        order.add(nonVegItem);

        //calculate the total order cost
        double totalOrderCost = 0;

        //iterate through the order ArrayList and calculate the total order cost
        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println();
            totalOrderCost += item.calculateTotalPrice() - ((item instanceof Discountable) ? ((Discountable) item).applyDiscount() : 0);
        }

        //print the total order cost
        System.out.println("Total Order Cost :- " + totalOrderCost);

    }
}