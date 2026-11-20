package collections;
import java.util.ArrayList;

public class Student {
	    String name;
	    int id;
	    double marks;

	    public Student(String name, int id, double marks) {
	        this.name = name;
	        this.id = id;
	        this.marks = marks;
	    }

	    public String toString() {
	        return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	    }

	    public static void main(String[] args) {

	        ArrayList<Student> s1 = new ArrayList<Student>();

	        s1.add(new Student("Rahul", 101, 85.5));
	        s1.add(new Student("Priya", 102, 90.5));
	        s1.add(new Student("Kiran", 103, 78.5));
	        s1.add(new Student("Anu", 104, 88.5));

	        for (int i = 0; i < s1.size(); i++) {
	            Object o1 = s1.get(i);
	            Student s = (Student)o1;
	            System.out.println(s);
	        }
	    }
	}


