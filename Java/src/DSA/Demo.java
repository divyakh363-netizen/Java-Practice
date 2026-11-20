package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;
    int marks;
    double cgpa;

    public Student(String name, int age, int marks, double cgpa) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.cgpa = cgpa;
    }
}

public class Demo {
    public static void main(String[] args) {

        Comparator<Integer> com = (Integer a, Integer b) ->
            Integer.compare(a % 10, b % 10);

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(
            42, 61, 23, 78, 84, 39
        ));

        Collections.sort(list, com.reversed());

        list.forEach((no) -> System.out.println(no));
    }
}