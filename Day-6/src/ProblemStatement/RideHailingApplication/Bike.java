package ProblemStatement.RideHailingApplication;

//Bike class which extends Vehicle and implements GPS interface
public class Bike extends Vehicle implements GPS{
    private String newLocation;
    private String driverName;

    //Constructor to initialize the driverName, vehicleNumber, type and rentalRate
    Bike(String driverName,String vehicleNumber, String type, int rentalRate){
        super(vehicleNumber,type,rentalRate);
        this.driverName=driverName;
    }

    //Overriding the getCurrentLocation method of GPS interface
    @Override
    public String getCurrentLocation() {
        return newLocation;
    }

    //Overriding the updateLocation method of GPS interface
    @Override
    public void updateLocation(String newLocation) {
        this.newLocation=newLocation;
    }

    //Overriding the calculateFare method of Vehicle class
    @Override
    public double calculateFare(double distance) {
        return distance*getRatePerKm();
    }
}
