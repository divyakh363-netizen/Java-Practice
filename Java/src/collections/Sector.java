package collections;

import java.util.Vector;

public class Sector {
    static void area(Vector v2) {
        for (int i = 0; i < v2.size(); i++) {
            int r = (int) v2.get(i);
            double half = 0.5;
            double theta = 1.25;
            System.out.println(half * r * r * theta);
        }
    }

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(10);
        v1.add(20);
        System.out.println(v1);
        area(v1);
    }
}
