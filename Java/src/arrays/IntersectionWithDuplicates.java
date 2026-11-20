package arrays;
import java.util.Set;
import java.util.LinkedHashSet;

public class IntersectionWithDuplicates {
		    public static void main(String[] args) {
	        int[] a1 = {1, 2, 3, 4, 4};
	        int[] a2 = {3, 3, 4, 5, 6};
	        
	        Set<Integer> s1 = new LinkedHashSet<>();
	        for (int x : a1) {
	            s1.add(x);
	        }
	        
	        Set<Integer> s2 = new LinkedHashSet<>();
	        for (int y : a2) {
	            if (s1.contains(y)) {
	                s2.add(y);
	            }
	        }
	        
	        System.out.println(s2);
	    }
	}

