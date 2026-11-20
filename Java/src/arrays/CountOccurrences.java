package arrays;

public class CountOccurrences
{
    public static void main(String[] args)
    {
        int[] a = {3, 1, 2, 1, 4, 5};
        int n = 1;
        int count = 0;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == n)
            {
                count++;
            }
        }

        System.out.println("Number of occurrences = " + count);
    }
}