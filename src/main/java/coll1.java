import java.util.*;

public class coll1 {


    public static void main(String args[])
    {
        List<Integer> c=new ArrayList<Integer>();
        c.add(599);
        c.add(113);
        c.add(321);


        Comparator<Integer>com=new comparator();
        Collections.sort(c,com);


        for(Integer i : c)
        {
            System.out.println(i);
        }

        /*
        Collections.reverse(c);*/
       /* Iterator i=c.iterator();
        while(i.hasNext())
        {

            System.out.print(i.next());
        }*/


    }
}
