//Create a class VehicleRegistration to pass details of a vehicle. 

public class VehicleRegistration {
    public static void main(String[] args) {
        //Create class objects.
        Vehicle vehicle1 = new Vehicle("kuchu", "Scooty", 12);
        
        //Check the instance of parent class.
        if(vehicle1 instanceof Vehicle){
            System.out.println("vehicle1 are instance of Vehicle");
        }
        else{
            System.out.println("vehicle1 are not an instance of Vehicle");
        }

        //update the registration fee to 400 using class name.
        Vehicle.updateRegistrationFee(400);

        //Display the result.
        vehicle1.display();
    }
}
