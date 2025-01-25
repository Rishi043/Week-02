package hybridinheritance.restaurantmanagementsystem;

// Create a Main class to test the classes
public class Main {

        public static void main(String[] args) {
            // Create a Chef object
            Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
            chef.displayPersonDetails();
            chef.performDuties();
            System.out.println("------------------------------------------------");

            // Create a Waiter object
            Waiter waiter = new Waiter("Sanjeev Kapoor", 201, "Outdoor");
            waiter.displayPersonDetails();
            waiter.performDuties();
        }
    }

