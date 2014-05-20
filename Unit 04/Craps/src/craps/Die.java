package craps;

public class Die 
{
    private int numDots;
    
    public Die(){
    
    }
    
    public void roll(){
        double x;
        x = Math.random();
        
        double y = (x*6)+1;
        int z = (int)y;
        
        numDots = z;
    }
    
    public int getNumDots(){
        return numDots;
    }
}
