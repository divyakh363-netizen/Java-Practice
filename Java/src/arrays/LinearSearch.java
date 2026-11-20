package arrays;

public class LinearSearch {
	    static void search(int a[], int target) {
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == target) {
	                System.out.println("The element is not found");
	                return;
	            }
	        }
	        System.out.println("Not found");
	    }

	    public static void main(String[] args) {
	        int a[] = {1, 2, 3, 4, 5, 6, 7};
	        search(a, 7);
	    }
	}


