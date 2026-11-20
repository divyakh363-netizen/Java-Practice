package comparable;
import java.util.ArrayList;
import java.util.Collections;

class Mobile implements Comparable<Mobile> {
    String name;
    int ram;

    Mobile(String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    public int compareTo(Mobile m) {
        return Integer.compare(this.ram, m.ram);
    }

    public String toString() {
        return name + " " + ram + "GB";
    }
}

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Mobile> l = new ArrayList<>();

        l.add(new Mobile("Samsung", 8));
        l.add(new Mobile("Redmi", 4));
        l.add(new Mobile("Vivo", 12));
        l.add(new Mobile("Oppo", 6));

        Collections.sort(l);

        for (Mobile m : l) {
            System.out.println(m);
        }
    }
}