package logic1;

class Palindrome11 {
    public static void main(String[] args) {

        String s = "java level madam racecar";

        String[] a = s.split(" ");

        String last = "";

        for (int i = 0; i < a.length; i++) {

            if (palindrome(a[i]))
                last = a[i];
        }

        System.out.println(last);
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