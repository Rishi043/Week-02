package multilevelinheritance.EducationalCourseHierarchy;

public class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    void coursedetails() {

        super.coursedetails();
        System.out.println("Platform: " + platform);
        System.out.println("is Recorded: " + isRecorded);
    }
}
