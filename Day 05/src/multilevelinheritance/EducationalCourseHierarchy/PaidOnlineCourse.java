package multilevelinheritance.EducationalCourseHierarchy;

public class PaidOnlineCourse extends OnlineCourse {
    int fee,discount;

    void coursedetails() {
        super.coursedetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount (in %): " + discount);
    }
}

