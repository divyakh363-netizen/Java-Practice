package arrays;

public class LastOccurrence
{
    public static void main(String[] args)
    {
        int[] a = {3, 1, 2, 1, 4, 5};
        int n = 1;

        for(int i = a.length - 1; i >= 0; i--)
        {
            if(a[i] == n)
            {
                System.out.println("Last occurrence is at index " + i);
                return;
            }
        }
    }
}
