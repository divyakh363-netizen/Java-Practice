package arrays;
import java.util.Set;
import java.util.HashSet;

public class PangramCheck {
	    public static void main(String[] args) {
	        String s = "the quick brown fox jumps over the lazy dog";
	        s = s.replaceAll(" ", "");
	        
	        Set<Character> s1 = new HashSet<>();
	        for (char x : s.toCharArray()) {
	            s1.add(x);
	        }
	        
	        if (s1.size() == 26) {
	            System.out.println("Panagram");
	        } else {
	            System.out.println("Not a Panagram");
	        }
	    }
	}

