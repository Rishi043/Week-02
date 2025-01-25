package hybridinheritance.vehiclemanagement;

// create two subclasses of Vehicle: ElectricVehicle and PetrolVehicle
// Subclass 1: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    // Create a constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println(model + " is charging with a battery capacity of " + batteryCapacity + " kWh.");
    }
}

