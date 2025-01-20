// Creating Class with name Person 
class Person { 

    // Defining attributes of the Person class
    private String name;
    private int age;

    // Parameterized Constructor to initialize Person object with name and age 
	
    public Person(String name, int age) 
	{
        this.name = name;
        this.age = age;
    }

    // Copy constructor to create a new Person object by copying another person's attributes 
	
    public Person(Person otherperson) {
        // Copying name and age from the other person object
        this.name = otherperson.name;
        this.age = otherperson.age;
    }

    // Method to display details of the Person object
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonClone {
    public static void main(String[] args) 
	{
        // Creating a Person object with name and age
        Person originalPerson = new Person("Ravi", 25);

        // Creating a new Person object using the copy constructor
        Person clonePerson = new Person(originalPerson);

        // Displaying the details of both objects
        System.out.println("Original Person:");
        originalPerson.display();

        System.out.println("Cloned Person:");
        clonePerson.display();
    }
}
