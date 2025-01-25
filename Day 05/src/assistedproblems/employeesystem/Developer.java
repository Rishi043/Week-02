package assistedproblems.employeesystem;

//Create a class Developer which will inherit the Employee class.
class Developer extends Employee{
    private String programmingLanguage;

    //Create a constructor which will take name, id, salary and programmingLanguage as parameters.
    Developer(String name, int id, int salary, String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage = programmingLanguage;
    }

    //Create a method to display the programming language.
    public void displayProgrammingLanguage(){
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
