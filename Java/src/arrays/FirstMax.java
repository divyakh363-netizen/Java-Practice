package arrays;

public class FirstMax {
    public static void main(String[] args) {
        int[] a = {3, 6, 1, 5, 4, 2};
        int max = -1; // or a[0] / Integer.MIN_VALUE

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
        
    }
}