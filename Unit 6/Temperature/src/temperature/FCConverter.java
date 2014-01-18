package temperature;

public class FCConverter 
{
    private double celsius;
    private double fahrenheit;
    
    public void setCelsius(double degrees)
    {
        double f = ((degrees*9)/5)+32;
        fahrenheit = f;
    }
    
    public void setFahrenheit(double degrees)
    {
        double c = ((degrees - 32)*5)/9;
        celsius = c;
    }
    
    public double getCelsius()
    {
        return celsius;
    }
    
    public double getFahrenheit()
    {
        return fahrenheit;
    }
}
