package collections;

public class SquareArea {
    static Object[] arr = { 5, 9, 3, 8, 13 };

    static void area(Object[] abb) {
        int side = (int) abb[0];
        double res = side * side;
        System.out.println(res);
    }

    public static void main(String[] args) {
        area(arr);
    }
}
