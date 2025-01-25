package hybridinheritance.vehiclemanagement;

//Create a class Vehicle with the following attributes and methods:
class Vehicle {
    protected String model;
    protected int maxSpeed;

    // Create a constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
