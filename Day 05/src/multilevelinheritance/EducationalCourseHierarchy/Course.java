package multilevelinheritance.EducationalCourseHierarchy;

/*

Course
  |
  +-- OnlineCourse
        |
        +-- PaidOnlineCourse

	" Multilevel Inheritance "

*/

public class Course {
    String courseName;
    String duration;

    void coursedetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
    }
}

