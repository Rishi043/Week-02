package assistedproblems.employeesystem;

public class Main {
    public static void main(String[] args)
    {
        //Create objects of Manager and call the displayDetails and displayTeamSize method.
        Manager manager = new Manager("Jungkook", 77, 200000000, 7);
        manager.displayDetails();
        manager.displayTeamSize();

        //Create objects of the Developer and call the displayDetails and displayProgrammingLanguage method.
        Developer developer = new Developer("Singh", 26, 300000, "Java");
        developer.displayDetails();
        developer.displayProgrammingLanguage();

        //Create an object of Intern and call the displayIntern method.
        Intern intern = new Intern();
        intern.displayIntern();
    }
}
