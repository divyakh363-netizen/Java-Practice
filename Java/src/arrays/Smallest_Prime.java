package arrays;

public class Smallest_Prime {
	    public static void main(String[] args) {

	        int[] a = {1, 2, 4, 5, 7, 8, 11, 3};

	        int small = 0;

	        for (int i = 0; i < a.length; i++) {

	            int count = 0;

	            for (int j = 1; j <= a[i]; j++) {
	                if (a[i] % j == 0) {
	                    count++;
	                }
	            }

	            if (count == 2) {
	                if (small == 0 || a[i] < small) {
	                    small = a[i];
	                }
	            }
	        }

	        System.out.println(small);
	    }
	}


