package orderquantity;

import java.util.Scanner;

public class OrderQuantity 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double price = .26;
        
        int loop1=1;
        
        while(loop1==1){
            System.out.print("Enter quantity: ");
            int num = input.nextInt();
            
            if(num%25!=0)
            {
                System.out.println("Ripples can be ordered only in packs of 25. ");
            }
            
            if(num%25==0){
            double sum = num*price;
            System.out.println("You have ordered " + num + " Ripples -- $" + sum);
            }
            
            int loop=1;
            while(loop!=0){
            System.out.println("Next customer (y/n): ");
            String choice = input.next();
            String yes = "y";
            String no = "n";
                if(choice.matches(yes)){
                    loop=0;
                }
                if(choice.contentEquals(no)){
                    loop1=2;
                    break;
                }
            }
            
        }
    }
    
}
