import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class coll1 {


    public static void main(String args[])
    {
        Collection<Integer> c=new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);

       /* Iterator i=c.iterator();
        while(i.hasNext())
        {

            System.out.print(i.next());
        }*/
        for(Integer i : c)
        {
            System.out.println(i);
        }

    }
}
