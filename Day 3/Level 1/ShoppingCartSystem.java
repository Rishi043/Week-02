//Create a class ShoppingCartSystem to pass details of a product 

public class ShoppingCartSystem {
    public static void main(String[] args) {
        //Create class objects.
        Product product1 = new Product("Viraj Cement", 100, 3, 1001);
        Product product2 = new Product("Princess Dusting Broom", 20, 1, 2001);

        //Check the instance of parent class.
        if(product1 instanceof Product && product2 instanceof Product){
            System.out.println("product1 and product2 are instance of Product");
        }
        else{
            System.out.println("product1 and product2 are not an instance of Product");
        }

        //Create variable to initialize new discount.
        float discount = 10.0f;

        //Update the discount by passing the new discount.
        Product.updateDiscount(discount);

        //Display the details.
        product1.display();
        product2.display();
    }
}
