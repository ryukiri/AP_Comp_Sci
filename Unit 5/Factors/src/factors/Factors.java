package factors;

import java.util.Scanner;

public class Factors 
{
    public static void main(String[] args) 
    {
        int y = 1;
        
        while(y>0){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number (negative to quit): ");
            int num = input.nextInt();
            
            if(num>0){
                System.out.println("The factors of " + num + " are: ");
                for(int i = 1; i<2*num; i++){
                    int x = num%i;
                        if(x==0){
                            System.out.println(i);
                        }
                 }
            }else if(num<0){
                y=-9;
            }
        }
    }
}
