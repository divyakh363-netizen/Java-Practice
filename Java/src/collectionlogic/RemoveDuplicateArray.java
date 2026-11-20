package collectionlogic;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArray {
	    public static void main(String[] args) {
	        int[] a = {5, 2, 9, 4, 5};

	        Set<Integer> set = new LinkedHashSet<>();
	        for (int x : a) {
	            set.add(x);
	        }

	        for (int y : set) {
	            System.out.print(y + " ");
	        }
	    }
	}

