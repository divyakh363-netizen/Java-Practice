package Comparator;
import java.util.*;

class SortName1 implements Comparator<String> {
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
}

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();

        l.add("Apple");
        l.add("Mango");
        l.add("Banana");
        l.add("Orange");

        Collections.sort(l, new SortName());
        System.out.println(l);
    }
}