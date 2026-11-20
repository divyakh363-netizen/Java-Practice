package DSA;

public class Main {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "java";
        String word = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String temp = s.substring(i, j);

                if (isPalindrome(temp) && temp.length() > max) {
                    max = temp.length();
                    word = temp;
                }
            }
        }

        System.out.println("Longest palindromic substring: " + word);
    }
}