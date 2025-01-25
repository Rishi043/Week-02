package assistedproblems.vehicletransportsystem;

public class Main
{
    public static void main(String[] args) {
        //Create an object of Car class and call the displayInfo and displaySeatCapacity method.
        Car car = new Car(200, "Petrol", 8);
        car.displayInfo();
        car.displaySeatCapacity();

        //Create an object of the MotorCycle class and call the displayInfo method.
        MotorCycle motorCycle = new MotorCycle(180, "Petrol");
        motorCycle.displayInfo();

        //Create an object of Truck class and call the displayInfo method.
        Truck truck = new Truck(60, "Diesel");
        truck.displayInfo();
    }
}

