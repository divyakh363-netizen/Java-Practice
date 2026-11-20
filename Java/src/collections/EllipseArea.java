package collections;

public class EllipseArea {
    static Object[] arr = { 5, 9, 3, 8, 13 };

    static void area(Object[] abb) {
        int a = (int) abb[0];
        int b = (int) abb[1];
        final double pi = 3.142;
        double res = pi * a * b;
        System.out.println(res);
    }

    public static void main(String[] args) {
        area(arr);
    }
}
