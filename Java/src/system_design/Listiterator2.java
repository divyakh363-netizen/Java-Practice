package system_design;
import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator2 {
	    public static void main(String[] args)
	    {
	        ArrayList l1 = new ArrayList();

	        l1.add("Java");
	        l1.add("Python");
	        l1.add("HTML");
	        l1.add("CSS");

	        ListIterator itr = l1.listIterator();

	        while(itr.hasNext())
	        {
	            Object o1 = itr.next();
	            System.out.println(o1);
	        }

	        while(itr.hasPrevious())
	        {
	            Object o1 = itr.previous();
	            System.out.println(o1);
	        }
	    }
	}


