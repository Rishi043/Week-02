//Create a class Patient to initialize a patient details. 

public class Patient {
    //Create data members to store details.
    static String hospitalName = "The British Indian Hospital";
    final int PATIENTID;
    private String name;
    private int age;
    private boolean ailment;
    //Variable to calculate total patient
    static int totalPatient = 0;

    //Constructor to initialize values using this keyword
    Patient(String name, int age, boolean ailment, int PATIENTID){
        this.name = name;
        this.age = age;
        this.PATIENTID = PATIENTID;
        this.ailment = ailment;
        totalPatient++;
    }

    //Count the total patient
    static void getTotalPatient(){
        System.out.println("The total number of patient are: "+ totalPatient);
    }

    //Display the details.
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Patient ID: " + PATIENTID);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital Name: " + hospitalName);
    }
}
