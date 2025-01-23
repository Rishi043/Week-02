import java.util.ArrayList;
import java.util.List;

// Doctor Class
class Doctor {
    String name; // Name of the doctor
    
    // Constructor to initialize doctor name
    Doctor(String name) {
        this.name = name;
    }
    
    // Method for a doctor to consult a patient
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting " + patient.getName() + ".");
        System.out.println("Consultation completed for " + patient.getName() + ".");
    }
    
    // Method to get the name of the doctor
    public String getName() {
        return name;
    }
}

// Patient Class
class Patient {
    String name; // Name of the patient
    
    // Constructor to initialize patient name
    Patient(String name) {
        this.name = name;
    }
    
    // Method to get the name of the patient
    public String getName() {
        return name;
    }
    
    // Method for the patient to visit a doctor
    public void visitDoctor(Doctor doctor) {
        doctor.consult(this); // Call the doctor's consult method
    }
}

// Hospital Class
class Hospital {
    String hospitalName; // Name of the hospital
    List<Doctor> doctors; // List of doctors in the hospital
    List<Patient> patients; // List of patients in the hospital
    
    // Constructor to initialize hospital name and initialize lists
    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    // Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    
    // Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    
    // Method to display hospital details
    public void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName()); // Display doctor names
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName()); // Display patient names
        }
    }
}

// Main Class
public class HospitalManagementCode {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("MegaCity Hospital");
        
        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Sharma");
        Doctor doctor2 = new Doctor("Dr. Singh");
        
        // Create patients
        Patient patient1 = new Patient("Dev");
        Patient patient2 = new Patient("Aditya");
        
        // Add doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        
        // Add patients to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        
        // Show hospital details
        hospital.showHospitalDetails();
        
        // Patients visiting doctors for consultations
        patient1.visitDoctor(doctor1); // Dev visits Dr. Sharma
        patient2.visitDoctor(doctor2); // Aditya visits Dr. Singh
        patient1.visitDoctor(doctor2); // Dev visits Dr. Singh
    }
}
