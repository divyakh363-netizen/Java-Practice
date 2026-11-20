package collections;

public class CircleArea {
    static Object[] arr = { 3, 5, 9, 3, 8, 13 };

    static void area(Object[] abb) {
        int r = (int) abb[0];
        final double pi = 3.142;
        double res = pi * r * r;
        System.out.println(res);
    }

    public static void main(String[] args) {
        area(arr);
    }
}