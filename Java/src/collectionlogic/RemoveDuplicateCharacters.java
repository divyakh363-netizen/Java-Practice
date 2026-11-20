package collectionlogic;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicateCharacters {
	    public static void main(String[] args) {
	        String s = "abcdbcd";
	        char[] ch = s.toCharArray();

	        Set<Character> set = new LinkedHashSet<>();
	        for (char x : ch) {
	            set.add(x);
	        }

	        for (char y : set) {
	            System.out.print(y);
	        }
	    }
	}

