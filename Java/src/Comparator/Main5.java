package Comparator;
import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class SortMarks implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.marks - b.marks;
    }
}

public class Main5 {
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<>();

        l.add(new Student("Divya", 90));
        l.add(new Student("Ravi", 75));
        l.add(new Student("Anu", 85));

        Collections.sort(l, new SortMarks());

        for (Student s : l) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}