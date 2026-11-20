package system_design;
import java.util.LinkedHashSet;
import java.util.Iterator;

class Sample1
{
    public static void main(String[] args)
    {
        LinkedHashSet l1 = new LinkedHashSet();

        l1.add(10);
        l1.add(20.20);
        l1.add('A');
        l1.add(true);

        Iterator itr = l1.iterator();

        while(itr.hasNext())
        {
            Object o1 = itr.next();
            System.out.println(o1);
        }
    }
}