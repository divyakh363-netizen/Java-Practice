package arrays;

public class FirstPositiveMissingNumber {
	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4, 6};
	        int n = a[a.length - 1]; // or expected max limit
	        int res = n * (n + 1) / 2;
	        
	        int sum = 0;
	        for (int x : a) {
	            sum = sum + x;
	        }
	        
	        System.out.println(res - sum);
	    }
	}

