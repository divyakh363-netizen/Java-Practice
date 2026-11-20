package arrays;

public class StringManipulations {
	    public static void main(String[] args) {
	        String s = "The Quick Brown fox jumps over the";
	        
	        String lowerStr = s.toLowerCase();
	        String upperStr = s.toUpperCase();
	        
	        // Mixture of upper & lowercase filtering using Regex
	        String filtered = s.replaceAll("[^a-zA-Z]", "");
	        
	        System.out.println("Lowercase: " + lowerStr);
	        System.out.println("Uppercase: " + upperStr);
	        System.out.println("Filtered Alphabets: " + filtered);
	    }
	}

