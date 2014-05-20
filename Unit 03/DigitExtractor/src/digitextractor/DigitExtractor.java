package digitextractor;

public class DigitExtractor 
{
    private int input;
    
    public DigitExtractor(int n)
    {
        input = n;
        
    }
    public int nextDigit()
    {
        if(input>10000){
            int lastDigit = input%10;
            input = input / 10;
            return lastDigit;
        }else if(input>1000){
            int secondtoLastDigit = input%10;
            input = input / 10;
            return secondtoLastDigit;
        }else if(input>100){
            int thirdDigit = input%10;
            input = input / 10;
            return thirdDigit;
        }else if(input>10){
            int secondDigit = input%10;
            input = input / 10;
            return secondDigit;
        }else if(input>0){
            int firstDigit = input%10;
            input = input / 10;
            return firstDigit;
        }
        return 0;
    }
}
