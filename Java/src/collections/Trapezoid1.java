package collections;
import java.util.ArrayList;

public class Trapezoid1 {
	    static void area(ArrayList l4, ArrayList l5, ArrayList l6) {
	        for (int i = 0; i < l4.size(); i++) {
	            int a = (int) l4.get(i);
	            int b = (int) l5.get(i);
	            int h = (int) l6.get(i);
	            double res = 0.5 * (a + b) * h;
	            System.out.println("sides " + a + " and " + b + " height " + h + " its area is " + res);
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
	        ArrayList l3 = new ArrayList();
	        l3.add(3);
	        l3.add(4);
	        l3.add(2);
	        area(l1, l2, l3);
	    }
	}


