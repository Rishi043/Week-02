package ProblemStatement.EmployeeManagementSystem;

    // Abstract class Employee
    public abstract class Employee implements Department {
        // Instance variables
        private final int employeeID;
        private String name;
        private int baseSalary;

        //Create a constructor with 3 parameters
        Employee(int employeeID, String name, int baseSalary){
            this.employeeID = employeeID;
            this.name = name;
            this.baseSalary = baseSalary;
        }

        // Getters and Setters for getBaseSalary
        public int getBaseSalary() {
            return baseSalary;
        }
        public void setBaseSalary(int baseSalary) {
            this.baseSalary = baseSalary;
        }

        // Getters for getEmployeeID
        public int getEmployeeID() {
            return employeeID;
        }

        // Getters and Setters for getName
        public String getName() {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }

        // Abstract method calculateSalary
        abstract int calculateSalary();

        // Method to display details
        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Employee ID:" + employeeID);
            System.out.println("Base Salary:" + baseSalary);
        }
}
