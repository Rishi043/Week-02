package ProblemStatement.RideHailingApplication;

// Importing required classes
import java.util.ArrayList;

public class RideHailing{
    public static void main(String[] args) {
        // Creating an ArrayList of Vehicle type
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Creating objects of Car, Bike and Auto classes
        Vehicle car=new Car("Kushu","Car2233","petrol",70);
        Vehicle bike=new Bike("Jennie","Bike7777","Petrol",40);
        Vehicle auto=new Auto("Kallu","Auto5675","E-rickshaw",50);

        // Adding the objects to the ArrayList
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Looping through the ArrayList and calling the getVehicleDetails() and calculateFare() methods
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            double fare = vehicle.calculateFare(30);
            System.out.println("Fare for the ride :- " + fare);
            System.out.println();
        }
    }
}