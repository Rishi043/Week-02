package ProblemStatement.VehicleRentalSystem;

//create an abstract class Vehicle that implements Insurable
public abstract class Vehicle implements Insurable {
    private final String vehicleNumber;
    private String type;
    private int rentalRate;

    // Constructor for Vehicle
    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters and Setters to get and set vehicle details
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    // Getters and Setters to get and set vehicle details
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getters and Setters to get and set vehicle details
    public int getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // create method to get vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: " + rentalRate);
    }
}
