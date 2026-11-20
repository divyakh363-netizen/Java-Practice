package collections;

import java.util.Vector;

public class Ellipse {
    public static void area(Vector v1, Vector v2) {
        for(int i = 0; i < v1.size(); i++) {
            int a = (int) v1.get(i);
            int b = (int) v2.get(i);
            double pi = 3.142;
            System.out.println(pi * a * b);
        }
    }

    public static void main(String[] args) {
        Vector v3 = new Vector();
        v3.add(10);
        v3.add(20);
        Vector v4 = new Vector();
        v4.add(20);
        v4.add(40);
        area(v3, v4);
    }
}
