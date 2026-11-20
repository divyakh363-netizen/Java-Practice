package arrays;
public class odd_indexed_value {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        for(int i=0;i<a.length;i++) {
            if(i%2==1)
                System.out.println(a[i]+"");
        }
    }
}