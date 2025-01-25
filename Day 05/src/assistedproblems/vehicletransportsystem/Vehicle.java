package assistedproblems.vehicletransportsystem;

//Create a class Vehicle. The class will have two protected variables maxSpeed and fuelType.
class Vehicle{
    //Create two protected variables maxSpeed and fuelType.
    protected float maxSpeed;
    protected String fuelType;

    //Create a method displayInfo which will print the maxSpeed and fuelType.
    public void displayInfo(){
        System.out.println("Max Speed: "+ maxSpeed + "km/h" + "\nFuel Type: " + fuelType);
    }
}

