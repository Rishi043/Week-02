package assistedproblems.employeesystem;

//Create class Employee to initialize the details.
class Employee{
    private String name;
    private int id;
    private int salary;

    //Create a constructor to initialize the details.
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //Create a method to display the details.
    public void displayDetails(){
        System.out.println("Name: "+ name +"\nID: "+ id +"\nSalary: "+ salary);
    }
}


