package arrays;

import java.util.Arrays;

public class NegativeElementsToFront {
    public static void main(String[] args) {

        int[] a = {-1, 3, -2, -5, 6, 4, 0};

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (a[i] < 0) {
                i++;
            }
            else if (a[j] >= 0) {
                j--;
            }
            else {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}