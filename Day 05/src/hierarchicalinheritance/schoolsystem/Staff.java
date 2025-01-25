package hierarchicalinheritance.schoolsystem;

    //create a class Staff that extends Person with the following attributes: areaOfWork
    public class Staff extends Person {
        private String areaOfWork;

        //create a constructor that initializes the attributes
        public Staff(String name, int age, String areaOfWork) {
            super(name, age );
            this.areaOfWork = areaOfWork;
        }
        @Override
        //display details
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Area Of Work: " + areaOfWork);
        }
    }

