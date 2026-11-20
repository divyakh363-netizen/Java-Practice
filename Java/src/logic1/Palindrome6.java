package logic1;

class Palindrome6 {
    public static void main(String[] args) {

        String s = "madam!!";

        char[] a = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            if (!((a[i] >= 'a' && a[i] <= 'z') ||
                  (a[i] >= 'A' && a[i] <= 'Z') ||
                  (a[i] >= '0' && a[i] <= '9'))) {

                i++;
                continue;
            }

            if (!((a[j] >= 'a' && a[j] <= 'z') ||
                  (a[j] >= 'A' && a[j] <= 'Z') ||
                  (a[j] >= '0' && a[j] <= '9'))) {

                j--;
                continue;
            }

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