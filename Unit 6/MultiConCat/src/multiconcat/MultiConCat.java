package multiconcat;

public class MultiConCat 
{
    public String concat(String w, int x)
    {
        if(x<2){
            x=1;
        }
        String w1 = w;
        int y = 1;
        while(y < x){
            w1+=w;
            y++;
        }
        return w1;
    }
    
    public String concat(String w)
    {
        
        String w1 = w;
        int x = 2;
        int y = 1;
        while(y < x){
            w1+=w;
            y++;
        }
        return w1;
    }
}
