package ProblemStatement.EmployeeManagementSystem;


// Import required classes
import java.util.ArrayList;

    public class EmployeeManagement {
        public static void main(String[] args) {
            // List to store employees (both full-time and part-time)
            ArrayList<Employee> employees = new ArrayList<>();

            // Create and add a full-time employee
            FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee(1, "Shinamu", 20000);
            fullTimeEmployee1.assignedDepartment("Developer");
            employees.add(fullTimeEmployee1);

            // Create and add another full-time employee
            FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee(2, "Shinchan", 30000);
            fullTimeEmployee2.assignedDepartment("Senior Developer");
            employees.add(fullTimeEmployee2);

            // Create and add a part-time employee
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(22, "Hyungkai", 2000, 4, 5000);
            partTimeEmployee.assignedDepartment("Intern");
            employees.add(partTimeEmployee);

            // Display details and salary of all employees
            for (Employee employee : employees) {
                employee.displayDetails();
                System.out.println("Total Salary: " + employee.calculateSalary());
                // Cast to Department to call getDepartmentDetails()
                ((Department) employee).getDepartmentDetails();
                System.out.println("-------------------------------------------------");
            }
        }
}
