import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map1 {

    public static void main(String args[])
    {

        Map<Integer,String> m1=new HashMap<Integer,String>();
        m1.put(1,"a");
        m1.put(8,"b");
        m1.put(3,"c");
        m1.put(4,"d");
        m1.put(5,"e");
        m1.put(1,"f");

        {
            System.out.println(m1);
        }


    }
}
