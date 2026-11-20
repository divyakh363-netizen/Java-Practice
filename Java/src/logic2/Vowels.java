package logic2;

public class Vowels{
    public static void main(String args[]){
        String s="HiHelloHowAreYou";
        int[] a=new int[127];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(check(ch)){
                a[ch]++;
            }
        }

        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                System.out.println((char)i+" "+a[i]);
            }
        }
    }

    static boolean check(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
           ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        else{
            return false;
        }
    }
}