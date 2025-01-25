package hybridinheritance.restaurantmanagementsystem;

public class Chef extends Person implements Worker {
    private String specialty;

    // Create a constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implement the performDuties method
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes, especially " + specialty + ".");
    }
}

