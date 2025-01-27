package ProblemStatement.HospitalPatientManagement;

// Importing required packages
import java.util.ArrayList;

// InPatient class to process inpatients
public class InPatient extends Patient implements MedicalRecord {
    // Instance variables
    private int daysAdmitted;
    private double dailyRate;

    // ArrayList to store medical records
    private ArrayList<String> medicalRecords = new ArrayList<>();

    // Constructor to initialize InPatient object
    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    // overridden method to calculate bill
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    // overridden method to add record
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    // overridden method to view records
    @Override
    public ArrayList<String> viewRecords() {
        return medicalRecords;
    }

    // overridden method to get patient details
    @Override
    public void getPatientDetails() {
        super.getPatientDetails();
        System.out.println("Type : In-Patient");
        System.out.println("Days Admitted : " + daysAdmitted);
        System.out.println("Daily Rate : " + dailyRate);
    }
}
