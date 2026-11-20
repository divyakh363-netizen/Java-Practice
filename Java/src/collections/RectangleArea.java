package collections;

public class RectangleArea {
    static Object[] arr = { 5, 9, 3, 8, 13 };

    static void area(Object[] abb) {
        int length = (int) abb[0];
        int width = (int) abb[1];
        double res = length * width;
        System.out.println(res);
    }

    public static void main(String[] args) {
        area(arr);
    }
}
