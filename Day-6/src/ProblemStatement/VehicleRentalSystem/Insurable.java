package ProblemStatement.VehicleRentalSystem;

//Create an interface Insurable with the following methods:
public interface Insurable {
    //calculateInsurance() - returns the insurance amount for the vehicle
    public abstract double calculateInsurance();

    //getInsuranceDetails() - returns the insurance details for the vehicle
    public abstract String getInsuranceDetails();
}