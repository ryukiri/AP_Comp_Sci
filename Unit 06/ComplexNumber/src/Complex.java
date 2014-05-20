
public class Complex
{
    private double a;
    private double b;
    
    public Complex(double x, double y)
    {
        a = x;
        b = y;
    }
    
    public Complex(double x)
    {
        this(x, 0.0);
    }
    
    public double getA(){
        return a;
    }
    
    public double getB()
    {
        return b;
    }
    
    public double abs()
    {
        // returns (√ a^2+b^2) for the complex number
        double inside = Math.pow(a,2) + Math.pow(b,2);
        double outside = Math.sqrt(inside);
        return outside;
    }
    
    public Complex add(Complex other) 
    { 
        double x = other.getA();
        double y = other.getB();
        
        double addX = x+a;
        double addY = y+b;
        return new Complex(addX, addY);
    } 
    
    public Complex add(double n)
    {
        return new Complex(a+n, b+0);
    }
    
    public Complex multiply(Complex other) 
    { 
        double x = other.getA();
        double y = other.getB();
        
        double addX = x*a;
        double addY = y*b;
        double firstX = addX-addY;
        
        double addXX = x*b;
        double addYY = y*a;
        double firstY = addXX+addYY;
        return new Complex(firstX, firstY);
    } 
    
    public Complex multiply(double n)
    {
        double addX = n*a;
        double addY = 0*b;
        double firstX = addX-addY;
        
        double addXX = n*b;
        double addYY = 0*a;
        double firstY = addXX+addYY;
        return new Complex(firstX, firstY);
        
    }
    
    public boolean equals(Complex other)
    {
        double newA = other.getA();
        double newB = other.getB();
        
        if(newA == a && newB ==b)
            return true;
        else
            return false;
    }
    
    public String toString()
    {
        return a + " " + "+" + " " + b + "i";
    }
}