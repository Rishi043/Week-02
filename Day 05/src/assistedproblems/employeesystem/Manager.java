package assistedproblems.employeesystem;

// Create a class Manager which will inherit the Employee class.
class Manager extends Employee {
    private int teamSize;

    //Create a constructor which will take name, id, salary and teamSize as parameters.
    Manager(String name, int id, int salary, int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }

    //Create a method to display the team size.
    public void displayTeamSize(){
        System.out.println("Team Size: "+ teamSize);
    }
}

