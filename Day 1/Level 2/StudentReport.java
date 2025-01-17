// Creating Class with name Student to represent student details and report 

class Student {
    String name;          
    int rollNumber;      
    double marks;         

    // Constructor to initialize the attributes of the Student class 
	
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the grade based on marks 
	
    String calculateGrade() {
        if (marks >= 90) 
		{
            return "A";
        } 
		else if (marks >= 80) 
		{
            return "B";
        } 
		else if (marks >= 70) 
		{
            return "C";
        } 
		else if (marks >= 60) 
		{
            return "D";
        } 
		else 
		{
            return "F";
        }
    }

    // Method to display student's details and grade 
	
    void displayStudentDetails() {
        System.out.println("Student Details:");
		System.out.println("----------------------");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

// Main class 
public class StudentReport {
	
    public static void main(String[] args) { 
	
        // Creating Student objects
        Student student1 = new Student("Kabir", 101, 92.5);

        // Displaying student details and grades
		
        student1.displayStudentDetails();

    }
}
