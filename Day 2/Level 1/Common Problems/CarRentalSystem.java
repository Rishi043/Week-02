import java.util.Scanner;

// Creating Class with name CarRental to manage car rental details 

class CarRental {
    // Defining attributes of the CarRental class
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double dailyRental = 50.0; // Fixed daily rental rate

    // Parameterized Constructor to initialize rental details 
	
    public CarRental(String customerName, String carModel, int rentalDays)  
	{
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost()  
	{
        return dailyRental * rentalDays;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

// Creating Class with name CarRentalSystem 

public class CarRentalSystem {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter car rental details
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter car model:");
        String carModel = scanner.nextLine();

        System.out.println("Enter number of rental days:");
        int rentalDays = scanner.nextInt();

        // Creating a CarRental object with user-provided details
        CarRental car1 = new CarRental(customerName, carModel, rentalDays);

        // Displaying the rental details
        System.out.println("\nRental Details:");
        car1.displayRentalDetails();

        // Closing the scanner object 
        scanner.close();
    }
}
