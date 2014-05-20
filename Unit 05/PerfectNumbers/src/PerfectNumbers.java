public class PerfectNumbers{
    private double fact;
    private long primeNum;
    private boolean yesNoPrime;
    private int perfect;
    
    public int perfectNumber(int n){
        int counter=0;
        int number=1;
        while(counter<n){
        double y = Math.pow(2, number)-1;
        int z = (int)y;
            if(primeNum(z)==true){
                double perfect1 = Math.pow(2, number-1)*(Math.pow(2, number)-1);
                counter++;
                number++;
                int perfect2 = (int) perfect1;
                perfect = perfect2;
            }else{
                number++;
            }
        }
        return perfect;
    }

    public long mersennePrime(int n)
    {
        int counter = 1;
        int number = 1;
        
        while(counter<=n){
            double x = Math.pow(2, number) - 1;
            int y = (int)x;
            if(PerfectNumbers.primeNumCheck(y)==true){
                counter++;
                number++;
                long y1 = (long)y;
                primeNum = y1;
            }else{
                number++;
            }
        }
        return primeNum;
    }    
        
    static boolean primeNum(int num){
      if(num<4){
          if(num == 1)
              return false;
      }
	for(int i = 3; i<=Math.sqrt(num) + 0.5; i+=2){
		if (num % i == 0){
			return false;
		}
	}
        return true;
    }

    static boolean primeNumb(double num){   
        boolean prime = true;
        
        if(num==1){
            return false;
        }
        
        int limit = (int) Math.sqrt ( num );  
            for (int i = 2; i <= limit; i++){
                if (num % i == 0){
                    prime = false;
                    break;
                }
            }
        return prime;
    }
    
  static boolean primeNumCheck(int number){
        if(number == 7){
            return true;
        }
        if(number>7){
            if(number%2==0 || number%3==0){
                return false;
            }else if(number%5==0 || number%7==0){
                return false;
            }else if(number%23==0){
                return false;
            }else{
                return true;
            }
        }else if(number<8){
            if(number == 1 || number == 4){
                return false;
            }else if(number==2 || number == 3){
                return true;
            }else if(number==5){
                return true;
            }
        }
        return false;
    }
}