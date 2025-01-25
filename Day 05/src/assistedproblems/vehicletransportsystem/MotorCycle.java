package assistedproblems.vehicletransportsystem;

//Create a class MotorCycle which will inherit the Vehicle class.
class MotorCycle extends Vehicle{
    //Create a constructor which will take maxSpeed and fuelType as parameters.
    MotorCycle(float maxSpeed, String fuelType){
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }
}
