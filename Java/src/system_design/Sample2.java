package system_design;

import java.util.LinkedHashSet;
import java.util.Iterator;

class Sample2
{
    public static void main(String[] args)
    {
        LinkedHashSet l1 = new LinkedHashSet();

        l1.add("Java");
        l1.add(100);
        l1.add('B');
        l1.add(50.5);

        Iterator itr = l1.iterator();

        while(itr.hasNext())
        {
            Object o1 = itr.next();
            System.out.println(o1);
        }
    }
}