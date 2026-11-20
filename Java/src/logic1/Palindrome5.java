package logic1;

class Palindrome5 {
    public static void main(String[] args) {

        String s = "Never Odd Or Even";

        s = s.replace(" ", "");

        char[] a = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            if (a[i] >= 'A' && a[i] <= 'Z')
                a[i] = (char)(a[i] + 32);

            if (a[j] >= 'A' && a[j] <= 'Z')
                a[j] = (char)(a[j] + 32);

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