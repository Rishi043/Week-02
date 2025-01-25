package hybridinheritance.restaurantmanagementsystem;


    // Create a super class for restaurant management. The system should have the following classes:
    public class Person {
        protected String name;
        protected int id;

        // Create a constructor
        public Person(String name, int id) {
            this.name = name;
            this.id = id;
        }

        // Create a method to display person details
        public void displayPersonDetails() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
        }
    }

