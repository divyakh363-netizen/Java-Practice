package collections;

public class ParallelogramArea {
    static Object[] arr = { 5, 9, 3, 8, 13 };

    static void area(Object[] abb) {
        int base = (int) abb[0];
        int height = (int) abb[1];
        double res = base * height;
        System.out.println(res);
    }

    public static void main(String[] args) {
        area(arr);
    }
}