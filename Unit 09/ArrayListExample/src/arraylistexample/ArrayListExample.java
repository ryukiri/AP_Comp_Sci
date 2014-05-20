package arraylistexample;
import java.util.*;

public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int y=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        while(y>-1){
            System.out.println("Enter a positive number (Negative to quit): ");
            y = input.nextInt();
            if(y>-1){
                arr.add(y);
            }
        }
        
        System.out.println("What number do you wan to insert?");
        int insert = input.nextInt();
        
        if(insert<arr.get(0))
            arr.add(0, insert);
            
        int ywoefa = arr.size();
        for(int i=1; i<ywoefa; i++){
            if(insert>=arr.get(i-1) && insert<=arr.get(i)){
                arr.add(i, insert);
                break;
            }
        }
        
        System.out.println("Here is your sorted array: ");
        for(int x : arr){
            System.out.println(x);
        }
        /*
        int sum=0;
        
        for(int x : arr){
            sum+=x;
        }
        
        double average = (double)sum/arr.size();
        
        System.out.println(average);
        */
        
    }   
}
