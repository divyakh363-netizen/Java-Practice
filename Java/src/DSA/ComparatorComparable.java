package DSA;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SSt implements Comparable<SSt> {
    String name;
    int age;
    int marks;
    double cgpa;

    public SSt(String name, int age, int marks, double cgpa) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Stud [name=" + name + ", age=" + age
                + ", marks=" + marks + ", cgpa=" + cgpa + "]";
    }

    @Override
    public int compareTo(SSt that) {
        return Double.compare(that.cgpa, this.cgpa);
    }
}

public class ComparatorComparable {

    public static void main(String[] args) {

        List<SSt> list = new ArrayList<>(Arrays.asList(
            new SSt("krishna", 25, 95, 9.2),
            new SSt("Prashanta", 23, 78, 7.0),
            new SSt("Sharat", 27, 85, 8.5),
            new SSt("chidu", 22, 80, 8.0)
        ));

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}