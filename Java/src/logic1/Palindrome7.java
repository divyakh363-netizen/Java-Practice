package logic1;

class Palindrome7 {
    public static void main(String[] args) {

        String s = "radar";

        char[] a = s.toCharArray();

        String rev = "";

        for (int i = a.length - 1; i >= 0; i--) {
            rev = rev + a[i];
        }

        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}