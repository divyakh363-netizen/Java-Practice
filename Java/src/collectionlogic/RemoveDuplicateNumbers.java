package collectionlogic;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicateNumbers {
	    public static void main(String[] args) {
	        int no = 12132345;

	        Set<Integer> set = new LinkedHashSet<>();
	        while (no > 0) {
	            int rem = no % 10;
	            set.add(rem);
	            no = no / 10;
	        }

	        System.out.println(set);
	    }
	}

