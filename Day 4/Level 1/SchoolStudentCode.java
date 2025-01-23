import java.util.*;

// School Class
class School {
    private String schoolName; // Name of the school
    private ArrayList<Student> student; // List of students in the school

    // Constructor to initialize the school name and student list
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.student = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student students) {
        student.add(students);
    }

    // Method to display school details and its students
    public void showDetail() {
        System.out.println("Name of School :- " + schoolName);
        for (Student stud : student) {
            System.out.println("Name of the Student :- " + stud.studentName);
            System.out.println("Courses enrolled:");
            stud.showDetailCourse(); // Display courses enrolled by the student
        }
    }
}

// Student Class
class Student {
    public String studentName; // Name of the student
    private ArrayList<Course> course; // List of courses the student is enrolled in

    // Constructor to initialize the student name and course list
    public Student(String studentName) {
        this.studentName = studentName;
        this.course = new ArrayList<>();
    }

    // Method to add a course for a student and enroll the student in the course
    public void addCourses(Course cou, Student obj) {
        course.add(cou); // Add course to the student's list
        cou.enrolled(obj); // Enroll the student in the course
    }

    // Method to display courses the student is enrolled in
    public void showDetailCourse() {
        for (Course cou : course) {
            System.out.println("Name of the course :- " + cou.courseName);
        }
    }
}

// Course Class
class Course {
    public String courseName; // Name of the course
    private ArrayList<Student> enrolledStudent; // List of students enrolled in the course

    // Constructor to initialize the course name and enrolled student list
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudent = new ArrayList<>();
    }

    // Method to enroll a student in the course
    public void enrolled(Student std) {
        enrolledStudent.add(std);
    }
}

// Main Class
public class SchoolStudentCode {
    public static void main(String args[]) {
        // Creating schools
        School school1 = new School("Laptop School");
        School school2 = new School("Dev Institute");
        School school3 = new School("Aditya Institute");

        // Creating students
        Student stud1 = new Student("Dev");
        Student stud2 = new Student("Aditya");
        Student stud3 = new Student("Ravi");
        Student stud4 = new Student("Ronit");

        // Creating courses
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        Course c3 = new Course("Social");
        Course c4 = new Course("Science");

        // Adding students to schools
        school1.addStudent(stud1);
        school1.addStudent(stud2);
        school1.addStudent(stud3);

        school2.addStudent(stud4);
        school2.addStudent(stud1);
        school2.addStudent(stud2);

        school3.addStudent(stud2);
        school3.addStudent(stud3);
        school3.addStudent(stud4);

        // Enrolling students in courses
        stud1.addCourses(c1, stud1);
        stud1.addCourses(c2, stud1);
        stud1.addCourses(c3, stud1);
        stud2.addCourses(c2, stud2);
        stud3.addCourses(c3, stud3);
        stud4.addCourses(c4, stud4);

        // Displaying details of each school
        school1.showDetail();
        school2.showDetail();
        school3.showDetail();
    }
}
