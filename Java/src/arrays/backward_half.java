package arrays;

public class backward_half {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        for(int i=a.length/2-1;i>=0;i--) {
            System.out.println(a[i]+"");
        }
    }
}
