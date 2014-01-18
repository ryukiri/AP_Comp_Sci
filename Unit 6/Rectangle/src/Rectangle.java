public class Rectangle 
{
    private int height;
    private int width;
    
    public Rectangle(int h, int w)
    {
        if(h>=0 && w>=0)
        {
            height = h;
            width = w;
        }
        
    }
    
    public Rectangle(int s)
    {
        this(s,s);
    }
    
    public Rectangle()
    {
        this(1,1);
    }
    
    public boolean isSquare()
    {
        if(height == width)
        {
            return true;
        }
        else
            return false;
    }
    
    public int quadratize()
    {
        double area = height * width;
        double sq = Math.sqrt(area);
        int sq1 = (int)sq;
        return sq1;
    }
}
