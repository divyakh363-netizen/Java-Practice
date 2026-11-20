package collections;

public class SectorArea {
    static Object[] arr = { 5, 60, 9, 3, 8, 13 };

    static void area(Object[] abb) {
        int r = (int) abb[0];
        int theta = (int) abb[1];
        double res = 0.5 * r * r * theta;
        System.out.println(res);
    }

    public static void main(String[] args) {
        area(arr);
    }
}
