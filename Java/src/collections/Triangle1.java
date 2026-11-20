package collections;
import java.util.ArrayList;


public class Triangle1 {
	    static void area(ArrayList l3, ArrayList l4) {
	        for (int i = 0; i < l3.size(); i++) {
	            int b = (int) l3.get(i);
	            int h = (int) l4.get(i);
	            double res = 0.5 * b * h;
	            System.out.println("base " + b + " height " + h + " its area is " + res);
	        }
	    }

	    public static void main(String[] args) {
	        ArrayList l1 = new ArrayList();
	        l1.add(6);
	        l1.add(9);
	        l1.add(8);
	        ArrayList l2 = new ArrayList();
	        l2.add(4);
	        l2.add(5);
	        l2.add(3);
	        area(l1, l2);
	    }
	}


