package hierarchicalinheritance.schoolsystem;

    //create a class Teacher that extends Person with the following attributes: subject
    public class Teacher extends Person {
        private String subject;

        //Create a constructor that initializes the attributes
        public Teacher(String name, int age, String subject) {
            super(name,age);
            this.subject = subject;
        }
        @Override
        //create a method to display details
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Subject: " + subject);
        }
    }

