import java.util.ArrayList;
import java.util.Scanner;

public class StandardDeviation {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        int loop=0;
        while(loop>-1){
            System.out.println("Enter some random numbers please (negative to quit): ");
            int x = input.nextInt();
            if(x>-1){
                num.add(x);
            }else
                break;
        }

        
        int size = num.size();
        double sum=0;
        
        for(int y : num){
            sum+=y;
        }
        
        double average = sum/size;
        
        double z = 0;
        for(int i=0; i<size; i++){
            z += Math.pow(average - num.get(i),2);
        }
        
        double d = z/size;
        System.out.println(Math.sqrt(d));
    }
}
