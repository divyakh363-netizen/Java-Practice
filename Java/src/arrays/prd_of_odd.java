package arrays;
public class prd_of_odd {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int prd = 1;
        for(int i=0;i<a.length;i++) {
            if(a[i]%2==1)
                prd *= a[i];
        }
        System.out.println(prd);
    }
}