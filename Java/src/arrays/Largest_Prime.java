package arrays;

public class Largest_Prime {
	    public static void main(String[] args) {

	        int[] a = {1, 2, 4, 5, 7, 8, 11, 3};

	        int large = 0;

	        for (int i = 0; i < a.length; i++) {

	            int count = 0;

	            for (int j = 1; j <= a[i]; j++) {
	                if (a[i] % j == 0) {
	                    count++;
	                }
	            }

	            if (count == 2) {
	                if (a[i] > large) {
	                    large = a[i];
	                }
	            }
	        }

	        System.out.println(large);
	    }
	}


