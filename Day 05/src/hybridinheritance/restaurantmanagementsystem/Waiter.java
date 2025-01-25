package hybridinheritance.restaurantmanagementsystem;

    // Create a Waiter class that extends the Person class and implements the Worker interface
    public class Waiter extends Person implements Worker {
        private String section;

        // create a constructor
        public Waiter(String name, int id, String section) {
            super(name, id);
            this.section = section;
        }

        // Implement the performDuties method
        @Override
        public void performDuties() {
            System.out.println(name + " is serving customers in the " + section + " section.");
        }
    }

