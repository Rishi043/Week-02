import java.util.ArrayList;
import java.util.List;

// Class representing a Course
class Course {
    private int id; // Unique course ID
    private String name; // Name of the course
    private Professor professor; // Assigned professor for the course
    private List<Student> students; // List of students enrolled in the course

    // Constructor to initialize course ID and name
    public Course(int id, String name) {
        this.id = id;
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        students.add(student);
    }

    // Getters for accessing private fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Student> getStudents() {
        return students;
    }
}

// Class representing a Professor
class Professor {
    private int id; // Unique professor ID
    private String name; // Name of the professor
    private List<Course> courses; // List of courses the professor teaches

    // Constructor to initialize professor ID and name
    public Professor(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Assign a course to the professor
    public void teachCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this); // Set the professor in the course
    }

    // Getters for accessing private fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

// Class representing a Student
class Student {
    private int id; // Unique student ID
    private String name; // Name of the student
    private List<Course> courses; // List of courses the student is enrolled in

    // Constructor to initialize student ID and name
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enroll the student in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // Add the student to the course's enrolled list
    }

    // Getters for accessing private fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

// Main class to manage the University System 

public class UniversityManagementSystemCode {
    public static void main(String[] args) {
        // Create lists for professors, courses, and students
        List<Professor> professors = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        // Adding Professors
        Professor professor1 = new Professor(1, "Dev");
        Professor professor2 = new Professor(2, "Aditya");
        professors.add(professor1);
        professors.add(professor2);

        // Adding Courses
        Course course1 = new Course(101, "Computer Science 101");
        Course course2 = new Course(102, "Data Structures");
        courses.add(course1);
        courses.add(course2);

        // Assign Professors to Courses
        professor1.teachCourse(course1);
        professor2.teachCourse(course2);

        // Adding Students
        Student student1 = new Student(1, "Rahul");
        Student student2 = new Student(2, "Ravi");
        students.add(student1);
        students.add(student2);

        // Enroll Students in Courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);

        // Display University Details
        System.out.println("\nUniversity Details:");

        // Display Professors and their Courses
        System.out.println("\nProfessors:");
        for (Professor professor : professors) {
            System.out.println("Professor ID: " + professor.getId() + ", Name: " + professor.getName());
            System.out.println("Teaches Courses:");
            for (Course course : professor.getCourses()) {
                System.out.println("  - " + course.getName());
            }
        }

        // Display Courses and their Details
        System.out.println("\nCourses:");
        for (Course course : courses) {
            System.out.println("Course ID: " + course.getId() + ", Name: " + course.getName());
            System.out.println("Taught by: " + (course.getProfessor() != null ? course.getProfessor().getName() : "No Professor Assigned"));
            System.out.println("Enrolled Students:");
            for (Student student : course.getStudents()) {
                System.out.println("  - " + student.getName());
            }
        }

        // Display Students and their Enrolled Courses
        System.out.println("\nStudents:");
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
            System.out.println("Enrolled in Courses:");
            for (Course course : student.getCourses()) {
                System.out.println("  - " + course.getName());
            }
        }
    }
}
