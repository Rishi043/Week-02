package ProblemStatement.HospitalPatientManagement;

// Importing required packages
import java.util.ArrayList;

// OutPatient class to process outpatients
public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    // ArrayList to store medical records
    private ArrayList<String> medicalRecords = new ArrayList<>();

    // Constructor to initialize OutPatient object
    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    // Overriding methods from interfaces
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Overriding methods from interfaces
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    // Overriding methods from interfaces
    @Override
    public ArrayList<String> viewRecords() {
        return medicalRecords;
    }

    // Overriding methods from interfaces
    @Override
    public void getPatientDetails() {
        super.getPatientDetails();
        System.out.println("Type : Out-Patient");
        System.out.println("Consultation Fee : " + consultationFee);
    }
}
