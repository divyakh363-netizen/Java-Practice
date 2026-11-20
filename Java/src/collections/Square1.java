package collections;
import java.util.ArrayList;

public class Square1 {
	    static void area(ArrayList l2) {
	        for (int i = 0; i < l2.size(); i++) {
	            int s = (int) l2.get(i);
	            double res = s * s;
	            System.out.println("side of " + s + " its area is " + res);
	        }
	    }

	    public static void main(String[] args) {
	        ArrayList l1 = new ArrayList();
	        l1.add(6);
	        l1.add(9);
	        l1.add(8);
	        l1.add(6);
	        l1.add(4);
	        area(l1);
	    }
	}


