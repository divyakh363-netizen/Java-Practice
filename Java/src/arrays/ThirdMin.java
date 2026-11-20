package arrays;

public class ThirdMin {
    public static void main(String[] args) {
        int[] a = {3, 6, 1, 5, 4, 2};
        int fmin = 1000, smin = 2000, tmin = 3000;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < fmin) {
                tmin = smin;
                smin = fmin;
                fmin = a[i];
            } else if (a[i] < smin) {
                tmin = smin;
                smin = a[i];
            } else if (a[i] < tmin) {
                tmin = a[i];
            }
        }
        System.out.println("first min " + fmin);
        System.out.println("second min " + smin);
        System.out.println("third min " + tmin);
        
    }
}
