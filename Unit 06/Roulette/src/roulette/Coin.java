package roulette;

public class Coin 
{
    private double value;
    private String name;
    
    /*
     * Constructs a coin
     * @param aValue the monetary value of the coin
     * @param aName the name of the coin
     */
    public Coin( double aValue, String aName )
    {
        value = aValue;
        name = aName;
    }
    
    /*
     * Returns the coin value.
     * @return coin value
     */
    public double getValue()
    {
        return value;
    }
    
    /*
     * Returns the coin name
     * @return coin name
     */
    public String getName()
    {
        return name;
    }
}
