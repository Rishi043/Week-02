package ProblemStatement.EmployeeManagementSystem;

// PartTimeEmployee class extends Employee class and implements Department interface
public class PartTimeEmployee extends Employee implements Department{
    // Instance variables
    private final int workingHour;
    private final int payPerHour;
    private String assignedDepartment;

    // Parameterized constructor for PartTimeEmployee class
    PartTimeEmployee(int employeeID, String name, int baseSalary, int workingHour, int payPerHour){
        super(employeeID, name, baseSalary);
        this.payPerHour = payPerHour;
        this.workingHour = workingHour;
    }

    // Overriding the calculateSalary method to calculate the salary of PartTimeEmployee
    @Override
    int calculateSalary(){
        return getBaseSalary()*workingHour*payPerHour;
    }

    // Overriding the displayDetails method to display the details of PartTimeEmployee
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Working Hours: "+workingHour);
        System.out.println("Payment Per Hour: "+ payPerHour);
    }

    // Overriding the assignedDepartment method to assign department to PartTimeEmployee
    @Override
    public void assignedDepartment(String department){
        this.assignedDepartment = department;
    }

    // Overriding the getDepartmentDetails method to get the department details of PartTimeEmployee
    @Override
    public void getDepartmentDetails(){
        System.out.println("Department: "+ this.assignedDepartment);
    }
}
