package ProblemStatement.RideHailingApplication;

// This class is a subclass of Vehicle and implements the GPS interface
public class Auto extends Vehicle implements GPS{
    private String newLocation;
    private String driverName;

    //create a constructor with 4 parameters
    Auto(String driverName,String vehicleNumber, String type, int rentalRate){
        super(vehicleNumber,type,rentalRate);
        this.driverName = driverName;
    }

    //override the getVehicleDetails method
    @Override
    public String getCurrentLocation() {
        return newLocation;
    }

    //override the getVehicleDetails method
    @Override
    public void updateLocation(String newLocation) {
        this.newLocation=newLocation;
    }

    //override the getVehicleDetails method
    @Override
    public double calculateFare(double distance) {
        return distance*getRatePerKm();
    }
}
