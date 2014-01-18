package roulette;

import java.util.ArrayList;

public class Purse 
{
    private ArrayList< Coin > purse;
    
    /*
     * Constructs an empty purse
     */
    public Purse()
    {
        purse = new ArrayList< Coin >();
    }
    
    /*
     * Adds a coin to the purse.
     * @param aCoin coin to add to Purse
     */
    public void add( Coin aCoin )
    {
        purse.add( aCoin );
    }
    
    /*
     * Removes a coin from the purse
     * @return coin removed
     */
    public Coin removeCoin()
    {
        if( purse.isEmpty() )
            return null;
        else
        {
            Coin aCoin = purse.get( 0 );
            purse.remove( 0 );
            return aCoin;
        }
    }
    
    /* 
     * Returns the total value of the coins in the purse.
     * @return total value in Purse
     */
    public double getTotal()
    {
        double total = 0;
        for( Coin aCoin : purse )
        {
            total += aCoin.getValue();
        }
        return total;
    }
    
    /*
     * Returns the number of coins in the purse
     * @return number of coins in Purse
     */
    public int coinCount()
    {
        return purse.size();
    }
}
