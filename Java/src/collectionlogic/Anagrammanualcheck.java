package collectionlogic;

public class Anagrammanualcheck {
	    public static void main(String[] args) {
	        String s1 = "act";
	        String s2 = "cat";

	        if (s1.length() == s2.length()) {
	            char[] c1 = s1.toCharArray();
	            char[] c2 = s2.toCharArray();

	            java.util.Arrays.sort(c1);
	            java.util.Arrays.sort(c2);

	            for (int i = 0; i < c1.length; i++) {
	                if (c1[i] != c2[i]) {
	                    System.out.println("Not Anagram");
	                    return;
	                }
	            }
	            System.out.println("Anagram");
	        } else {
	            System.out.println("Not Anagram");
	        }
	    }
	}


