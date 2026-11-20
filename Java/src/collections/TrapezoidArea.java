package collections;

public class TrapezoidArea {
    static Object[] arr = { 5, 9, 3, 8, 13 };

    static void area(Object[] abb) {
        int a = (int) abb[0];
        int b = (int) abb[1];
        int height = (int) abb[2];
        double res = 0.5 * (a + b) * height;
        System.out.println(res);
    }

    public static void main(String[] args) {
        area(arr);
    }
}
