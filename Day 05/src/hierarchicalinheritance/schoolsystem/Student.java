package hierarchicalinheritance.schoolsystem;

    //create a class Student that extends Person with the following attributes: grade
    public class Student extends Person {
        private int grade ;

        //create a constructor that initializes the attributes
        public Student(String name, int age , int grade) {
            super(name, age );
            this.grade = grade;
        }
        @Override
        //create a method to display details
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Grade: " + grade);
        }
    }

