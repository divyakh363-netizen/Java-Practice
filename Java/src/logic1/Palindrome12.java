package logic1;

class Palindrome12 {
    public static void main(String[] args) {

        String s = "wow madam racecar level";

        String[] a = s.split(" ");

        String longest = "";

        for (int i = 0; i < a.length; i++) {

            if (palindrome(a[i])) {

                if (a[i].length() > longest.length())
                    longest = a[i];
            }
        }

        System.out.println(longest);
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