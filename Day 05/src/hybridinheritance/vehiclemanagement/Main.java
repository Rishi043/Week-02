package hybridinheritance.vehiclemanagement;

// Create a Main  class to test the classes
public class Main {
        public static void main(String[] args) {
            // Create an ElectricVehicle object
            ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 200, 75);
            tesla.displayDetails();
            tesla.charge();
            System.out.println("---------------------------------------------------------------");

            // Create a PetrolVehicle object
            PetrolVehicle honda = new PetrolVehicle("Honda Civic", 180, 50);
            honda.displayDetails();
            honda.refuel();
        }
    }


