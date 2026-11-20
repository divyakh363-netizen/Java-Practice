package arrays;

public class FirstMin {
    public static void main(String[] args) {
        int[] a = {3, 6, 1, 5, 4, 2};
        int min = 1000; // or a[0] / Integer.MAX_VALUE

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
        
    }
}
