package scenario;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Mainclass1 {

    private final static int ID = 0;
    private final static int NAME = 1;
    private final static int SALARY = 2;
    private final static int DESIGNATION = 3;
    private final static int EXP = 4;
    private final static int LOCATION = 5;
    private final static int GENDER = 6;

    private String[][] employee = {
        {"101", "Asha", "85000", "Java Full Stack Developer", "5", "Hyderabad", "Female"},
        {"102", "Rahul", "92000", "Backend Developer", "7", "Bengaluru", "Male"},
        {"103", "Sneha", "98000", "Java Full Stack Developer", "6", "Hyderabad", "Female"},
        {"104", "Kiran", "76000", "Java Full Stack Developer", "4", "Hyderabad", "Male"},
        {"105", "Divya", "88000", "QA Engineer", "8", "Chennai", "Female"},
        {"106", "Arjun", "105000", "Technical Lead", "10", "Pune", "Male"},
        {"107", "Priya", "91000", "Java Full Stack Developer", "9", "Hyderabad", "Female"}
    };

    // 1. Display Employee with Highest Salary

    public void getMaxSalary() {

        System.out.println("\n1. Employee with Highest Salary");

        Optional<String[]> result = Arrays.stream(employee)
                .max(Comparator.comparingDouble(
                        emp -> Double.parseDouble(emp[SALARY])
                ));

        result.ifPresent(Mainclass1::display);
    }

    // 2. Display Female Employee with Maximum Experience

    public void getFemaleEmpMaxExp() {

        System.out.println("\n2. Female Employee with Maximum Experience");

        Optional<String[]> result = Arrays.stream(employee)
                .filter(emp -> emp[GENDER].equalsIgnoreCase("Female"))
                .max(Comparator.comparingInt(
                        emp -> Integer.parseInt(emp[EXP])
                ));

        result.ifPresent(Mainclass1::display);
    }

    // 3. Display Employees Working in Hyderabad
    //    as Java Full Stack Developers

    public void getHyderabadJavaDevelopers() {

        System.out.println("\n3. Hyderabad Java Full Stack Developers");

        Arrays.stream(employee)
                .filter(emp -> emp[LOCATION].equalsIgnoreCase("Hyderabad"))
                .filter(emp -> emp[DESIGNATION].equalsIgnoreCase("Java Full Stack Developer"))
                .forEach(Mainclass1::display);
    }

    // Common Method to Display Employee Details

    public static void display(String[] emp) {

        System.out.println("Employee ID: " + emp[ID]);
        System.out.println("Name: " + emp[NAME]);
        System.out.println("Salary: " + emp[SALARY]);
        System.out.println("Designation: " + emp[DESIGNATION]);
        System.out.println("Experience: " + emp[EXP] + " years");
        System.out.println("Location: " + emp[LOCATION]);
        System.out.println("Gender: " + emp[GENDER]);

        System.out.println("----------------------------------");
    }

    // Main Method

    public static void main(String[] args) {

        Mainclass1 m = new Mainclass1();

        m.getMaxSalary();

        m.getFemaleEmpMaxExp();

        m.getHyderabadJavaDevelopers();
    }
}