// Creating Class with name Vehicle to manage vehicle details and registration fee

class Vehicle {

    // Instance variables for each vehicle
    private String ownerName;
    private String vehicleType;

    // Class variable for the registration fee (shared by all vehicles
    private static double registrationFee = 500;            // default value

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display the details 
	
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee)  
	{
        registrationFee = newFee;
    }
}

// Creating Public Class with name VehicleManagementSystem  

public class VehicleManagementSystem 
{
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("John", "Car");
        Vehicle vehicle2 = new Vehicle("Smith", "Bike");

        // Displaying vehicle details before updating the registration fee
        System.out.println("Vehicle 1 Details (Before Fee Update):");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details (Before Fee Update):");
        vehicle2.displayVehicleDetails();

        // Updating the registration fee for all vehicles
        Vehicle.updateRegistrationFee(600);

        // Displaying vehicle details after updating the registration fee
        System.out.println("\nVehicle 1 Details (After Fee Update):");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details (After Fee Update):");
        vehicle2.displayVehicleDetails();
    }
}
