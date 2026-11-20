package Comparator;
import java.util.*;

class SortNumber1 implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(15);
        l.add(50);
        l.add(25);
        l.add(35);

        Collections.sort(l, new SortNumber());
        System.out.println(l);
    }
}