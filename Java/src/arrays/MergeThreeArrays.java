package arrays;

import java.util.Arrays;

public class MergeThreeArrays {
    public static void main(String[] args) {
        int[] a1 = {5, 3, 4};
        int[] a2 = {2, 1, 6};
        int[] a3 = {9, 8, 7};

        int[] temp = new int[a1.length + a2.length + a3.length];
        System.arraycopy(a1, 0, temp, 0, a1.length);
        System.arraycopy(a2, 0, temp, a1.length, a2.length);
        System.arraycopy(a3, 0, temp, a1.length + a2.length, a3.length);
        Arrays.sort(temp);

        System.out.println(Arrays.toString(temp));
    }
}
