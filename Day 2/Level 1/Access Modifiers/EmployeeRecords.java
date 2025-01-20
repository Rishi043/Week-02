// Parent class 

class Employee 
{
    public String employeeID;       // Public variable
    protected String department;    // Protected variable
    private double salary;           // Private variable

    // Constructor to initialize employee details
    public Employee(String employeeID, String department, double salary) 
	{
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get the salary
    public double getSalary() 
	{
        return salary;
    }

    // Public method to modify the salary
    public void setSalary(double salary)
	{
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }
}

// Subclass Manager that inherits from Employee

class Manager extends Employee 
{
    // Constructor to initialize Manager details
    public Manager(String employeeID, String department, double salary) 
	{
        super(employeeID, department, salary); // Using the constructor from Employee
    }

    // Method to display Manager details
	
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);    // Public field accessible
        System.out.println("Department: " + department);     // Protected field accessible
        System.out.println("Salary: " + getSalary());        // Private field accessed via public method
    }
}

// Main class 
public class EmployeeRecords { 
    public static void main(String[] args)  
	{
        // Creating an Employee object
        Employee emp1 = new Employee("A123", "Sales", 5000);

        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + emp1.employeeID);
        System.out.println("Department: " + emp1.department);    // Protected member access
        System.out.println("Salary: " + emp1.getSalary());

        // Modifying the salary using public method
        emp1.setSalary(5500);
        System.out.println("Updated Salary: " + emp1.getSalary());

        // Creating a Manager object
        Manager manager1 = new Manager("D234", "HR", 8000);

        System.out.println("\nManager Details:");
        manager1.displayManagerDetails();
    }
}
