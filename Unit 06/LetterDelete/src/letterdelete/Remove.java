package letterdelete;

public class Remove 
{
    public String removeChar(String s, char c)
    {
        //Mississippi

        String s2 = s.replace(c, ' ');
        String s3 = s2.replaceAll(" ","");
        return s3;
    }
}
