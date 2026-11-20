package collections;

import java.util.Vector;

public class Parallelogram {
    static void area(Vector v2, Vector v3) {
        for(int i = 0; i < v2.size(); i++) {
            int b = (int) v2.get(i);
            int h = (int) v3.get(i);
            System.out.println(b * h);
        }
    }

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(10);
        v1.add(20);
        Vector v3 = new Vector();
        v3.add(10);
        v3.add(20);
        area(v1, v3);
    }
}