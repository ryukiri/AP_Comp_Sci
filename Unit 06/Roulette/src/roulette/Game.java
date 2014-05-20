package roulette;
public class Game 
{
    private Spinner myWheel;
    /*
     * Game constructor: Creates the roulette wheel by constructing the appropriate Spinner
     */
   public Game()
   {
       // Code goes here
       myWheel = new Spinner(4);
   }
   
   /*
    * Simulates a spin returning a 0, 2, or 3 as defined by the routlette wheel pictured 
    * in the problem. 
    * @return result of spinning wheel
    */
   public int spinTheWheel()
   {
       // Code goes here
        int spin = myWheel.spin();
        if(spin==0 || spin == 1){
            return 0;
        }
        else 
           return spin;
   }
   
   /*
    * Simulates the game of roulette as follows:
    * Until the purse total is twice its original value
    * or there are no coins left in the purse, 
    * removes a coin from the purse, and updates the number of coins
    * in purse according tot he winnings. 
    * @return total value in Purse
    */

public double playRoulette( Purse myPurse )
{
    double original = myPurse.getTotal() * 2;
    Coin bet = myPurse.removeCoin();
    int spin = spinTheWheel();
    if(spin == 2){
        myPurse.add(bet);
        myPurse.add(bet);
    }
    else if(spin == 2){
        myPurse.add(bet);
        myPurse.add(bet);
    }
    
    return myPurse.getTotal();
}   
}
