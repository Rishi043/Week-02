// Creating Class with name Course to manage course details and institute name
class Course { 

    // Instance variables for each course
    private String courseName;
    private int duration; 
    private double fee;

    // Class variable for the institute name (shared by all courses)
    private static String instituteName = "Default Institute";

    // Parameterized Constructor to initialize course details 
	
    public Course(String courseName, int duration, double fee) 
	{
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method 
	
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update the institute name
	
    public static void updateInstituteName(String newInstituteName)   // Institute name will get updated
	{
        instituteName = newInstituteName;
    }
}

// Creating Class with name OnlineCourseManagement to test Course functionality
public class OnlineCourseManagement 
{
    public static void main(String[] args) 
	{
        // Creating course objects
        Course course1 = new Course("Java Programming", 12, 499);
        Course course2 = new Course("Web Development", 10, 399);

        // Displaying course details before updating institute name
        System.out.println("Course 1 Details (Before Update):");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details (Before Update):");
        course2.displayCourseDetails();

        // Updating the institute name for all courses
        Course.updateInstituteName("Tech Academy");

        // Displaying course details after updating institute name
        System.out.println("\nCourse 1 Details (After Update):");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details (After Update):");
        course2.displayCourseDetails();
    }
}
