package ProblemStatement.VehicleRentalSystem;

// Truck class extending Vehicle
public class Truck extends Vehicle{
    private String insurancePolicyNumber;

    // Constructor for Truck class
    public Truck(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Overriding abstract methods from Vehicle class
    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() + 1000; // Fixed additional charge for trucks
    }

    // Overriding abstract methods from Vehicle class
    @Override
    public double calculateInsurance() {
        return 0.1 * getRentalRate(); // 10% of daily rental rate as insurance
    }

    // Overriding abstract methods from Vehicle class
    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber;
    }

}
