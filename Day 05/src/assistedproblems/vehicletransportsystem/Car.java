package assistedproblems.vehicletransportsystem;

//Create a class Car which will inherit the Vehicle class.
class Car extends Vehicle{
    private int seatCapacity;

    //Create a constructor which will take maxSpeed, fuelType and seatCapacity as parameters.
    Car(float maxSpeed, String fuelType, int seatCapacity){
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
        this.seatCapacity = seatCapacity;
    }

    //Create a method displaySeatCapacity which will print the seatCapacity.
    public void displaySeatCapacity(){
        System.out.println("Seat Capacity: "+ seatCapacity);
    }
}
