package numbers;

public class Product_of_even {
	    public static void main(String[] args) {

	        int no = 1934;
	        int product = 1;

	        while (no != 0) {
	            int rem = no % 10;

	            if (rem % 2 == 0) {
	                product = product * rem;
	            }

	            no = no / 10;
	        }

	        System.out.println(product);
	    }
	}


