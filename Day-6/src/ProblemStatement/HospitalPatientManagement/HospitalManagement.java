package ProblemStatement.HospitalPatientManagement;

// Importing required packages
import java.util.ArrayList;

// HospitalManagement class to process patients
public class HospitalManagement {

    // Method to process patients using arraylist of patients
    public static void processPatients(ArrayList<Patient> patients) {
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Medical Records :- " + ((MedicalRecord) patient).viewRecords());
            System.out.println("Bill Amount :- " + patient.calculateBill());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating inpatient objects
        Patient inPatient = new InPatient(101, "Maya barochi", 50, 10, 2000);
        ((MedicalRecord) inPatient).addRecord("Admitted for brain surgery");

        // Creating outpatient objects
        Patient outPatient = new OutPatient(102, "Shukla Sharma", 60, 500);
        ((MedicalRecord) outPatient).addRecord("Consultation for Knee pain");

        // Creating arraylist of patients
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(inPatient);
        patients.add(outPatient);
        processPatients(patients);
    }

}