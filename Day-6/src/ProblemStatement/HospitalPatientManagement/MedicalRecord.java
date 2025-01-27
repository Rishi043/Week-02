package ProblemStatement.HospitalPatientManagement;

// Importing required packages
import java.util.ArrayList;
// MedicalRecord interface with addRecord and viewRecords methods
public interface MedicalRecord {
    void addRecord(String record);
    ArrayList<String> viewRecords();
}