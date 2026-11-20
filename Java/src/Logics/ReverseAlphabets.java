package Logics;

class ReverseAlphabets {
    public static void main(String[] args) {
        String s = "a1b2c3";
        char[] a = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (!Character.isLetter(a[i]))
                i++;
            else if (!Character.isLetter(a[j]))
                j--;
            else {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(a);
    }
}