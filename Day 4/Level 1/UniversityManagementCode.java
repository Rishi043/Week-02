import java.util.ArrayList;
import java.util.List;

// Class representing a Faculty member
class Faculty {
    String name; // Name of the faculty member

    // Constructor to initialize faculty name
    Faculty(String name) {
        this.name = name;
    }

    // Method to display faculty details
    public void displayFaculty() {
        System.out.println("Faculty Name: " + name);
    }
}

// Class representing a Department in the university
class Department {
    String departmentName; // Name of the department
    List<Faculty> faculties; // List of faculty members in the department

    // Constructor to initialize department name and faculty list
    Department(String departmentName) {
        this.departmentName = departmentName;
        faculties = new ArrayList<>();
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Method to display department details, including its faculties
    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Faculty faculty : faculties) {
            faculty.displayFaculty(); // Display each faculty member
        }
    }
}

// Class representing a University
class University {
    String universityName; // Name of the university
    List<Department> departments; // List of departments in the university

    // Constructor to initialize university name and department list
    University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display university details, including its departments and faculties
    public void displayUniversity() {
        System.out.println("University: " + universityName);
        for (Department department : departments) {
            department.displayDepartment(); // Display each department
        }
    }

    // Method to delete the university by clearing all departments
    public void deleteUniversity() {
        System.out.println("Deleting University: " + universityName);
        departments.clear(); // Remove all departments
    }
}

// Main class

public class UniversityManagementCode {
    public static void main(String[] args) {
        // Creating faculty members
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");
        Faculty faculty3 = new Faculty("Dr. White");

        // Creating departments
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");

        // Adding faculties to departments
        dept1.addFaculty(faculty1);
        dept1.addFaculty(faculty2);
        dept2.addFaculty(faculty2);
        dept2.addFaculty(faculty3);

        // Creating a university
        University university = new University("Tech University");

        // Adding departments to the university
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Displaying university details
        university.displayUniversity();

        // Deleting the university
        university.deleteUniversity();

        // Displaying university details after deletion
        System.out.println("\nAfter deleting the university:");
        university.displayUniversity(); // Should show no departments or faculties
    }
}
