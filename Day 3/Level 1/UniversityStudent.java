//Create a class UniversityStudent to pass details of students 

public class UniversityStudent {
    public static void main(String[] args) {
        //Create class objects.
        Student student1 = new Student("Kabir", 20, "A");
        Student student2 = new Student("karan", 21, "A+");

        //Check the instance of parent class.
        if(student1 instanceof Student && student2 instanceof Student){
            System.out.println("student1 and student2 are instance of Student");
        }
        else{
            System.out.println("student1 and student2 are not an instance of Student");
        }

        //Display the details.
        student1.display();
        student2.display();

        //Get the total number of students from totalStudentDisplay mathod.
        Student.totalStudentDisplay();
    }
}
