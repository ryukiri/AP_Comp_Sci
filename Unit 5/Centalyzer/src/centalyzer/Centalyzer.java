package centalyzer;

public class Centalyzer 
{
    private double numOld;
    private double numNew;
    
    public Centalyzer(double weight){
        /*Up until 1982 -  95% Copper and 5% tin and zinc (3.1 grams)
        *After 1982 - 97.6% zinc and 2.4% copper (2.5 grams)
        *Bag itself weighs 7 grams
        */
        double oldC=1000;
        double newC=0;
        weight = weight - 7.0;
        
        for(int i=0; i<1000; i++){
            double wOld = 3.1;
            double wNew = 2.5;
            double x = newC*2.5;
            double y = oldC*3.1;
            double totalWeight = x+y;
            double z = Math.abs(weight-totalWeight);
            
            oldC--;
            newC++;
                if(z<=0.01){
                    numNew = newC;
                    numOld = oldC;
                    break;
                }   
        }
    }
    
    int getOldCoins(){
        int x = (int)numOld;
        return x+1;
    }
    
    int getNewCoins(){
        int x = (int)numNew;
        return x-1;
    }
}
