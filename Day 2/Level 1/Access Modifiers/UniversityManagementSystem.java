// Parent class Student
class Student { 

    public String rollNumber;
    protected String name;
    private double CGPA;

    public Student(String rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 4.0) {
            this.CGPA = CGPA;
        } 
		else 
		{
            System.out.println("Invalid CGPA!");
        }
    }
}

// Subclass/Childclass PostgraduateStudent

class PostgraduateStudent extends Student 
{
    public PostgraduateStudent(String rollNumber, String name, double CGPA) 
	{
		// used super keyword to access the members (methods and variables) of the parent class.
        super(rollNumber, name, CGPA);
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

// Main class 
public class UniversityManagementSystem 
{
    public static void main(String[] args) 
	{
        Student student1 = new Student("RS12345", "ABHI", 3.5);
        student1.setCGPA(3.8);

        PostgraduateStudent pgStudent1 = new PostgraduateStudent("AL421", "John", 3.9);

        System.out.println("Student 1 Details:");
        System.out.println("Roll Number: " + student1.rollNumber);
        System.out.println("Name: " + student1.name);
        System.out.println("CGPA: " + student1.getCGPA());

        System.out.println("\nPostgraduate Student Details:");
        pgStudent1.displayDetails();
    }
}
