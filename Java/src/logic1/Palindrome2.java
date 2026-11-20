package logic1;

class Palindrome2 {
    public static void main(String[] args) {

        String s = "level";

        char[] a = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            if (a[i] != a[j]) {
                System.out.println("Not Palindrome");
                return;
            }

            i++;
            j--;
        }

        System.out.println("Palindrome");
    }
}