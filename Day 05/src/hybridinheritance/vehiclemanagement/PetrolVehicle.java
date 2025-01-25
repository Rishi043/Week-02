package hybridinheritance.vehiclemanagement;

// Subclass 2: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity; // in liters

    // create a constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    // Implement the refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println(model + " is refueling with a fuel capacity of " + fuelCapacity + " liters.");
    }
}

