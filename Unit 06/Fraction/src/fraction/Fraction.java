package fraction;

public class Fraction 
{
    private int num;
    private int denom;
    
    public Fraction()
    {
        denom = 1;
    }
    
    public Fraction(int a)
    {
        this(a,1);
    }
    
    public Fraction(int b, int c)
    {
        num = b;
        denom = c;
        reduce();
    }
    
    public Fraction(Fraction other)
    {
        num = other.num;
        denom = other.denom;
        
    }
    
    void reduce()
    {
        int count = 1;
        while(count==1){
            if(num%2==0)
            {
                num=num/2;
            }
            if(denom%2==0)
            {
                denom=denom/2;
            }
            if(num%2!=0 || denom % 2!=0)
            {
                count++;
            }
        }
        
        //num = num/2;
        //denom = denom/2;
    }
    
    String getNum()
    {
        return num + "/" + denom;
    }
}
