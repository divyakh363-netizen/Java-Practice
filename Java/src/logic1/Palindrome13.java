package logic1;

class Palindrome13 {
    public static void main(String[] args) {

        String s = "wow madam racecar level";

        String[] a = s.split(" ");

        String smallest = "";

        for (int i = 0; i < a.length; i++) {

            if (palindrome(a[i])) {

                if (smallest.equals("") ||
                    a[i].length() < smallest.length()) {

                    smallest = a[i];
                }
            }
        }

        System.out.println(smallest);
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