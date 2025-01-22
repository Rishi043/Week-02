//Create a class Student to initialize a Student details. 

public class Student {
    //Create data members to store details.
    static String universityName = "Seoul National University";
    private String name;
    final int rollNumber;
    private String grade;
    //Variable to calculate total student.
    static int totalStudent = 0;

    //Constructor to initialize values using this keyword
    Student(String name, int rollNumber, String grade){
        totalStudent++;
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    //Display the details.
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("University name: " + universityName);
    }

    //Count the total student
    static void totalStudentDisplay(){
        System.out.println("Total Students are: " + totalStudent);
    }

}
