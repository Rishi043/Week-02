class Employee {
    String name;
    int id, salary;

    // Constructor
    Employee(String name, int id, int salary)   // used to initialise the objects
	{
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() 
	{
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

// Main class to demonstrate Employee details 

public class EmployeeDetails {
    public static void main(String[] args) {
		
        // Creating an Employee object with details of Rohan
        Employee employee1 = new Employee("Rohan", 01, 100000);
        
        // Creating another Employee object with details of Kartik
        Employee employee2 = new Employee("Kartik", 02, 50000);          

        // Displaying details of Rohan
        employee1.displayDetails();

        // Displaying details of Kartik
        employee2.displayDetails();
    }
}