package collections;


	import java.util.Vector;

	public class Circle {
	    static void area(Vector v) {
	        for (int i = 0; i < v.size(); i++) {
	            int r = (int) v.get(i);
	            double pi = 3.142;
	            double result = pi * r * r;
	            System.out.println(result);
	        }
	    }

	    public static void main(String[] args) {
	        Vector v1 = new Vector();
	        v1.add(10);
	        v1.add(20);
	        v1.add(30);
	        v1.add(40);
	        area(v1);
	    }
	}


