package hierarchicalinheritance.schoolsystem;

public class Main {
    public static void main(String[] args) {
        //create an object for Teacher class
        Teacher teacher = new Teacher("John", 28,"Korean");
        //displaying details of teacher
        teacher.displayDetails();

        //create an object for Student class
        Student student = new Student("singh", 20, 11);
        //displaying details of student
        student.displayDetails();

        //create an object for Staff class
        Staff staff = new Staff("Kirti", 29, "Painting");
        //displaying details of staff
        staff.displayDetails();

    }
}

