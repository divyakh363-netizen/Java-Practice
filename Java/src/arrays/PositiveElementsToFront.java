package arrays;

import java.util.Arrays;

public class PositiveElementsToFront {
    public static void main(String[] args) {

        int[] a = {-1, 3, -2, -5, 6, 4, 0};
        int i = 0;

        for (int j = 0; j < a.length; j++) {
            if (a[j] > 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
