package factory;

public class operatingfactory
{
        public os getInstance(String s)
        {
            if(s.equals("open"))
                return new android();
            else
                 return new ios();
        }

}
