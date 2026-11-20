package collections;

import java.util.Vector;

public class Square {
    static void area(Vector v2) {
        for(int i = 0; i < v2.size(); i++) {
            int a = (int) v2.get(i);
            System.out.println(a * a);
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