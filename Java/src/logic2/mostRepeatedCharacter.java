package logic2;

class mostRepeatedCharacter {

    public static void main(String[] args) {

        String s = "aabbbbbveraaaadddd";
        int[] a = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            a[ch]++;
        }

        int n = 0;
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if (a[i] >= n) {
                    n = a[i];
                    c = i;
                }
            }
        }

        System.out.println("most repeated character is: " + (char)c + " " + n + " times");
    }
}