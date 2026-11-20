package Comparator;
import java.util.*;

class SortName implements Comparator<String> {
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
}

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();

        l.add("Ravi");
        l.add("Anu");
        l.add("Kiran");
        l.add("Bala");

        Collections.sort(l, new SortName());
        System.out.println(l);
    }
}