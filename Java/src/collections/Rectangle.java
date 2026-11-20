package collections;
	import java.util.Vector;

	public class Rectangle {
	    static void area(Vector v2, Vector v3) {
	        for(int i = 0; i < v2.size(); i++) {
	            int w = (int) v2.get(i);
	            int h = (int) v3.get(i);
	            System.out.println(w * h);
	        }
	    }

	    public static void main(String[] args) {
	        Vector v1 = new Vector();
	        v1.add(10);
	        v1.add(20);
	        Vector v3 = new Vector();
	        v3.add(30);
	        v3.add(40);
	        area(v1, v3);
	    }
	}


