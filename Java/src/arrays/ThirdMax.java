package arrays;

public class ThirdMax {
    public static void main(String[] args) {
        int[] a = {3, 6, 1, 5, 4, 2};
        int fmax = -1, smax = -2, tmax = -3;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > fmax) {
                tmax = smax;
                smax = fmax;
                fmax = a[i];
            } else if (a[i] > smax) {
                tmax = smax;
                smax = a[i];
            } else if (a[i] > tmax) {
                tmax = a[i];
            }
        }
        System.out.println("first max " + fmax);
        System.out.println("second max " + smax);
        System.out.println("third max " + tmax);
        
    }
}