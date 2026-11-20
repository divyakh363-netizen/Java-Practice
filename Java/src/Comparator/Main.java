package Comparator;
import java.util.*;

class SortNumber implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return a - b;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(40);
        l.add(10);
        l.add(30);
        l.add(20);

        Collections.sort(l, new SortNumber());
        System.out.println(l);
    }
}