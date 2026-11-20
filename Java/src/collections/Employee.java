package collections;
import java.util.ArrayList;
public class Employee {
	    String empName;
	    int empId;
	    double empSal;

	    public Employee(String empName, int empId, double empSal) {
	        this.empName = empName;
	        this.empId = empId;
	        this.empSal = empSal;
	    }

	    public String toString() {
	        return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + "]";
	    }

	    public static void main(String[] args) {

	        ArrayList<Employee> e1 = new ArrayList<Employee>();

	        e1.add(new Employee("Paju", 101, 59950.50));
	        e1.add(new Employee("Rani", 102, 59950.50));
	        e1.add(new Employee("Jaggu", 103, 59950.50));
	        e1.add(new Employee("Indumathi", 104, 59950.50));

	        for (int i = 0; i < e1.size(); i++) {
	            Object o1 = e1.get(i);
	            Employee e = (Employee)o1;
	            System.out.println(e);
	        }
	    }
	}

