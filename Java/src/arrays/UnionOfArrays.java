package arrays;
import java.util.Set;
import java.util.LinkedHashSet;
public class UnionOfArrays {
		    public static void main(String[] args) {
	        int[] a1 = {1, 2, 3, 4, 5};
	        int[] a2 = {2, 3, 4, 5, 6};
	        
	        Set<Integer> s1 = new LinkedHashSet<>();
	        
	        for (int x : a1) {
	            s1.add(x);
	        }
	        
	        for (int y : a2) {
	            s1.add(y);
	        }
	        
	        System.out.println(s1);
	    }
	}

