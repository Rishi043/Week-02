//Create a class HospitalManagement to pass values of a patient 

public class HospitalManagement {
    public static void main(String[] args) {
        //Create class objects.
        Patient patient1 = new Patient("Kuchu", 20, false, 01);
        Patient patient2 = new Patient("kannur", 22, true, 02);

        //Check the instance of parent class.
        if(patient1 instanceof Patient && patient2 instanceof Patient){
            System.out.println("patient1 and patient2 are instance of Patient");
        }
        else{
            System.out.println("patient1 and patient2 are not an instance of Patient");
        }

        //Display the details.
        patient1.display();
        patient2.display();

        //Get the total number of patient from getTotalPatient mathod.
        Patient.getTotalPatient();
    }
}
