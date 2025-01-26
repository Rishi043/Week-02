package ProblemStatement.VehicleRentalSystem;

// Importing required packages
import java.util.ArrayList;
import java.util.List;

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        //create objects of Car, Bike and Truck
        Car car = new Car("Maruti800", 1000, "POLICY001");
        Bike bike = new Bike("FireBolt120", 2000, "POLICY002");
        Truck truck = new Truck("Isuzu", 2500, "POLICY003");

        // Add vehicles to the list
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Iterate over each vehicles and calculate costs
        int rentalDays = 3; // Example rental duration
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Details:");
            vehicle.getVehicleDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));

            System.out.println("Insurance Cost: " + ((Insurable) vehicle).calculateInsurance());
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
            System.out.println("-------------------------");
        }
    }

}