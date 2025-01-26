package ProblemStatement.VehicleRentalSystem;

// Bike class extending Vehicle
public class Bike extends Vehicle{
    private final String insurancePolicyNumber;

    // Constructor
    public Bike(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Overridden methods
    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    // Calculate insurance cost
    @Override
    public double calculateInsurance() {
        return 0.03 * getRentalRate(); // 3% of daily rental rate as insurance
    }

    // Get insurance details
    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber;
    }
}