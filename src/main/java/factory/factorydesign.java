package factory;

public class factorydesign
{
    public  static void main(String args[])
    {
        operatingfactory osf=new operatingfactory();
        os o1=osf.getInstance("open");
        o1.spec();

    }

}
