import java.util.*;

// Creating Company class to manage departments and employees
class Company {
    private String name; // Name of the company
    private ArrayList<Department> dept = new ArrayList<Department>(); // List of departments in the company

    // Constructor to initialize the company name
    Company(String name) {
        this.name = name;
        this.dept = new ArrayList<>();
    }

    // Method to add a new department
    public void addDept(String d) {
        dept.add(new Department(d));
    }

    // Method to add an employee to a specific department
    public void setterEmp(String dName, String eName) {
        for (Department d : dept) {
            if (dName.equals(d.name)) { // Check if department name matches
                d.addEmp(eName); // Add employee to the department
            }
        }
    }

    // Method to display details of the company, departments, and employees
    public void showDetails() {
        System.out.println("Company: " + name); // Display company name
        for (Department d : dept) {
            d.show(); // Call the display method of each department
        }
    }
}

// Creating Department class to manage employees within a department
class Department {
    private ArrayList<Employee> emp = new ArrayList<Employee>(); // List of employees in the department
    public String name; // Name of the department

    // Constructor to initialize the department name
    Department(String name) {
        this.name = name;
        this.emp = new ArrayList<>();
    }

    // Method to add a new employee to the department
    public void addEmp(String obj) {
        emp.add(new Employee(obj));
    }

    // Method to display department name and employee names
    public void show() {
        System.out.println("Department: " + name); // Display department name
        for (Employee s : emp) {
            System.out.println("Employee: " + s.getName()); // Display employee name
        }
    }
}

// Creating Employee class to represent individual employees
class Employee {
    private String name; // Name of the employee

    // Constructor to initialize the employee name
    Employee(String name) {
        this.name = name;
    }

    // Method to get the employee's name
    public String getName() {
        return name;
    }
}

// Main class to test the functionality of the Company, Department, and Employee classes
public class CompanyCompostion {
    public static void main(String args[]) {
        // Creating a company instance
        Company c = new Company("Capgemini");

        // Adding departments to the company
        c.addDept("Developer");
        c.addDept("HR");

        // Adding employees to specific departments
        c.setterEmp("Developer", "Deepak");
        c.setterEmp("HR", "Ravi");

        // Displaying the company, department, and employee details
        c.showDetails();
    }
}
