//Create a class Vehicle to initialize a Vehicle details. 

public class Vehicle {
    //Create data members to store details.
    static int registrationFee = 200;
    private String ownerName;
    private String vehicleType;
    final int registrationNumber;

    //Constructor to initialize values using this keyword
    Vehicle(String ownerName, String vehicleType, int registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    //Update the registration fee shared among the objects
    static void updateRegistrationFee(int newRegistrationFee){
        registrationFee = newRegistrationFee;
    }

    //Display the details.
    void display(){
        System.out.println("Owner name: " + ownerName);
        System.out.println("Vehicle type: " + vehicleType);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Registration fee: " + registrationFee);
    }

}
