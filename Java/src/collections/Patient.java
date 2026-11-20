package collections;
import java.util.ArrayList;
public class Patient {
	    String name;
	    int patientId;
	    double bill;

	    public Patient(String name, int patientId, double bill) {
	        this.name = name;
	        this.patientId = patientId;
	        this.bill = bill;
	    }

	    public String toString() {
	        return "Patient [name=" + name + ", patientId=" + patientId + ", bill=" + bill + "]";
	    }

	    public static void main(String[] args) {

	        ArrayList<Patient> p1 = new ArrayList<Patient>();

	        p1.add(new Patient("Ravi", 101, 5000));
	        p1.add(new Patient("Anitha", 102, 7500));
	        p1.add(new Patient("Kiran", 103, 6500));
	        p1.add(new Patient("Pooja", 104, 9000));

	        for (int i = 0; i < p1.size(); i++) {
	            Object o1 = p1.get(i);
	            Patient p = (Patient)o1;
	            System.out.println(p);
	        }
	    }
	}

