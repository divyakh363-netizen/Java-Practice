package logic1;

class Palindrome8 {
    public static void main(String[] args) {

        String s = "java level madam code";

        String[] a = s.split(" ");

        for (int i = 0; i < a.length; i++) {

            if (palindrome(a[i]))
                System.out.println(a[i]);
        }
    }

    static boolean palindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}