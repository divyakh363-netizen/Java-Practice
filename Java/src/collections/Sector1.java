package collections;
import java.util.ArrayList;

public class Sector1 {
	    static void area(ArrayList l3, ArrayList l4) {
	        for (int i = 0; i < l3.size(); i++) {
	            int r = (int) l3.get(i);
	            int angle = (int) l4.get(i);
	            final double pi = 3.142;
	            double res = pi * r * r * angle / 360;
	            System.out.println("radius " + r + " angle " + angle + " its area is " + res);
	        }
	    }

	    public static void main(String[] args) {
	        ArrayList l1 = new ArrayList();
	        l1.add(6);
	        l1.add(9);
	        l1.add(8);
	        ArrayList l2 = new ArrayList();
	        l2.add(60);
	        l2.add(90);
	        l2.add(45);
	        area(l1, l2);
	    }
	}


