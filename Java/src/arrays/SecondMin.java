package arrays;

public class SecondMin {
    public static void main(String[] args) {
        int[] a = {3, 6, 1, 5, 4, 2};
        int fmin = 1000, smin = 2000;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < fmin) {
                smin = fmin;
                fmin = a[i];
            } else if (a[i] < smin) {
                smin = a[i];
            }
        }
        System.out.println("first min " + fmin);
        System.out.println("second min " + smin);
        
    }
}
