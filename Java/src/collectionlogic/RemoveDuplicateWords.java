package collectionlogic;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	    public static void main(String[] args) {
	        String s = "hi hello how hi how are you";
	        String[] x = s.split(" ");

	        Set<String> set = new LinkedHashSet<>();
	        for (String word : x) {
	            set.add(word);
	        }

	        for (String y : set) {
	            System.out.print(y + " ");
	        }
	    }
	}

