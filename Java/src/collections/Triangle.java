package collections;

import java.util.Vector;

public class Triangle {
    public static void area(Vector v1, Vector v2) {
        for(int i = 0; i < v1.size(); i++) {
            int a = (int) v1.get(i);
            int b = (int) v2.get(i);
            double half = 0.5;
            System.out.println(half * a * b);
        }
    }

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(10);
        v1.add(20);
        Vector v2 = new Vector();
        v2.add(30);
        v2.add(40);
        area(v1, v2);
    }
}