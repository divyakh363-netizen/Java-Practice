package collectionlogic;
import java.util.Arrays;
public class AnagramCheck {
	    public static void main(String[] args) {
	        String s1 = "act";
	        String s2 = "cat";

	        if (s1.length() == s2.length()) {
	            char[] c1 = s1.toCharArray();
	            char[] c2 = s2.toCharArray();

	            Arrays.sort(c1);
	            Arrays.sort(c2);

	            if (Arrays.equals(c1, c2)) {
	                System.out.println("Anagram");
	            } else {
	                System.out.println("Not an Anagram");
	            }
	        } else {
	            System.out.println("Not an Anagram");
	        }
	    }
	}

