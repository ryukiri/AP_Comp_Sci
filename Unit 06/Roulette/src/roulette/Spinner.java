package roulette;
// The Spinner class is used to simulate the spin

public class Spinner 
{
    private int choices;
    
    /**
     *  Constructs a spinner. 
     * @param s number of choices on spinner
     */
    public Spinner( int s )
    {
        choices = s;
    }
    
    /*
     * Returns an integer from 0 to the number of choices - 1 inclusive. 
     * @return a random spin in the range [0, choices)
     */
    public int spin()
    {
        return ( int )( Math.random() * choices );
    }
    
}
