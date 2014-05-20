package centalyzer;

public class CentralyzerTest 
{
    public static void main(String args[])
    {
        Centalyzer coin = new Centalyzer(3105.2);
        System.out.println("New Coins: " + coin.getNewCoins());
        System.out.println("Old Coins: " + coin.getOldCoins());
    }
}
