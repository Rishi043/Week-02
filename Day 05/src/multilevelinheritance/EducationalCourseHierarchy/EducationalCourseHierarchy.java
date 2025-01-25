package multilevelinheritance.EducationalCourseHierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {

        PaidOnlineCourse course1 = new PaidOnlineCourse();

        course1.courseName = "Java Learn";
        course1.duration = "6 Months";
        course1.platform = "W3 School";
        course1.isRecorded = true;

        course1.fee = 5000;
        course1.discount = 10;

        System.out.println("--- Course Details ---");
        course1.coursedetails();
    }
}
