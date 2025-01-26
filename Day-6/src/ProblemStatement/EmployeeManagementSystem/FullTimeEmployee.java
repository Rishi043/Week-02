package ProblemStatement.EmployeeManagementSystem;

// FullTimeEmployee class extends Employee class and implements Department interface
public class FullTimeEmployee extends Employee implements Department{
    // assignedDepartment is a private variable of type String
    private String assignedDepartment;

    // FullTimeEmployee constructor with 3 parameters
    FullTimeEmployee(int employeeID, String name,int baseSalary){
        super(employeeID, name, baseSalary);
    }

    // calculateSalary method returns the base salary of the employee
    @Override
    int calculateSalary() {
        return getBaseSalary();
    }

    // displayDetails method displays the details of the employee
    @Override
    public void assignedDepartment(String department){
        this.assignedDepartment = department;
    }

    // getDepartmentDetails method displays the department of the employee
    @Override
    public void getDepartmentDetails(){
        System.out.println("Department: "+ assignedDepartment);
    }
}
