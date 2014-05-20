public class convertName 
{
    String convertName(String word)
    {
        int start = 0;
        int x=0;
        for(int i = 0; i<word.length(); i++)
            if(word.charAt(i)==',')
                x=i;
        
        String w1 =word.substring(x+2)+" ";
        w1 += word.substring(start, x);
        return w1;
    }
}
