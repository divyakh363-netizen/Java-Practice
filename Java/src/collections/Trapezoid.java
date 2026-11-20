package collections;

import java.util.Vector;

public class Trapezoid {
    public static void area(Vector v1, Vector v2, Vector v3) {
        for(int i = 0; i < v1.size(); i++) {
            int a = (int) v1.get(i);
            int b = (int) v2.get(i);
            int h = (int) v3.get(i);
            final double half = 0.5;
            System.out.println(0.5 * (a + b) * h);
        }
    }

    public static void main(String[] args) {
        Vector v4 = new Vector();
        v4.add(10);
        v4.add(20);
        Vector v5 = new Vector();
        v5.add(30);
        v5.add(40);
        Vector v6 = new Vector();
        v6.add(50);
        v6.add(60);
        area(v4, v5, v6);
    }
}