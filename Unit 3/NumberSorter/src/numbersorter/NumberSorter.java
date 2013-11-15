package numbersorter;
import java.util.Scanner;

public class NumberSorter 
{
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int x = input.nextInt();

        
        System.out.println("Enter a number: ");
        int y = input.nextInt();
     
        
        System.out.println("Enter a number: ");
        int z = input.nextInt();
    
        if(x<y && y < z){
            System.out.println("" + x + y + z);
        }else if(z<y && y<x){
            System.out.println("" + z + "" + y + "" + x);
        }else if(y<x && z<y){
            System.out.println("" + y + z + x);
        }else if(z<x && y<z){
            System.out.println("" + z + y + x);
        }else if(x<z && y<x){
            System.out.println("" + y + x + z);
        }else if(z<y && x<z){
            System.out.println("" + x + z + y);
        }else if(x<y && z<x){
            System.out.println("" + z + "" + x + "" + y);
        }else if(x<y && z<x){
            System.out.println("" + y + "" + x + "" + z);
        }
    }
}
