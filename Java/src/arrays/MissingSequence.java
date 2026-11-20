package arrays;
import java.util.List;
import java.util.ArrayList;
public class MissingSequence {
		    public static void main(String[] args) {
	        int[] a = {2, 6, 9, 11, 13};
	        List<Integer> l1 = new ArrayList<>();
	        
	        for (int x : a) {
	            l1.add(x);
	        }
	        
	        for (int i = a[0]; i <= a[a.length - 1]; i++) {
	            if (!l1.contains(i)) {
	                System.out.println(i);
	            }
	        }
	    }
	}

