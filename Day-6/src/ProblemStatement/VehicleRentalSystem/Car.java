package ProblemStatement.VehicleRentalSystem;

// Car class extending Vehicle
public class Car extends Vehicle{
    private String insurancePolicyNumber;

    //create a constructor
    public Car(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    //override the calculateRentalCost method
    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    //override the calculateInsurance method
    @Override
    public double calculateInsurance() {
        return 0.05 * getRentalRate(); // 5% of daily rental rate as insurance
    }

    //override the getInsuranceDetails method
    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber;
    }

}
