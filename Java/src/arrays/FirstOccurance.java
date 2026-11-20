package arrays;

public class FirstOccurance
{
    public static void main(String[] args)
    {
        int[] a = {3, 1, 2, 1, 4, 5};
        int n = 1;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == n)
            {
                System.out.println("First occurrence is at index " + i);
                return;
            }
        }
    }
}