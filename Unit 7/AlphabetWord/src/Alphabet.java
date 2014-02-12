
public class Alphabet 
{   
    public void sort(String word1, String word2, String word3)
    {
        //"Tom", "Bob", "Henry"
        
        String y = " ";
        int x = word1.compareToIgnoreCase(y); //first word
        int xx = word2.compareToIgnoreCase(y);    //second word
        int xxx =word3.compareToIgnoreCase(y);    //third word
        //System.out.println(x);
        //System.out.println(xx);
        //System.out.println(xxx);
        
        
        if((x<xx && x<xxx) && xx<xxx)
        {
            System.out.println(word1);
            System.out.println(word2);
            System.out.println(word3);
        }else if((x<xxx && x<xx) && xxx<xx)
        {
            System.out.println(word3);
            System.out.println(word1);
            System.out.println(word2);
        }else if((xxx<xx && xxx<x) && xx<x)
        {
            System.out.println(word3);
            System.out.println(word2);
            System.out.println(word1);
        }else if((xx<xxx && xx<x) && xxx<x)
        {
            System.out.println(word2);
            System.out.println(word3);
            System.out.println(word1);
        }else if((xx<xxx && xx<x) && x<xxx)
        {
            System.out.println(word2);
            System.out.println(word1);
            System.out.println(word3);
        }
        
    }
}
