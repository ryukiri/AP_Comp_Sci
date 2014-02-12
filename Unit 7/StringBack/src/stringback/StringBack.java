package stringback;

public class StringBack 
{
    public void backwards(String s)
    {
        for(int i = s.length()-1; i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}
