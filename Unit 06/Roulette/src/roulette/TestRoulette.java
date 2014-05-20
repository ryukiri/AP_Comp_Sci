package roulette;

public class TestRoulette 
{
    public static void main( String [] args )
    {
        Purse myPurse = new Purse();
        Coin quarter = new Coin( 0.25, "Quarter" );
        //Adds 10 quarters to the purse
        for( int i = 0; i < 10; i++ )
            myPurse.add( quarter );
        
        Game myGame = new Game();
        // Simulates 10 Games
        for( int i = 0; i < 5; i++ )
        {
            System.out.println( "Simulating Game #" + ( i + 1 ) + "\n Starting value of purse: $" + myPurse.getTotal() );
            System.out.println( "Ending value of purse: $" + myGame.playRoulette( myPurse ) );
            if( myPurse.coinCount() == 0 )
            {
                 //Adds 10 quarters to the purse
                for( int j = 0; j < 10; j++ )
                    myPurse.add( quarter );
            }
            
        }
                
    }
}
