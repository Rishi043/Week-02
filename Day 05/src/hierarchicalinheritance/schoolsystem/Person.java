package hierarchicalinheritance.schoolsystem;

//create a class Person with the following attributes: name, age
public class Person{
        private String name;
        private int age;

        //Create a constructor that initializes the attributes
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        //create a method to display details
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

    }

