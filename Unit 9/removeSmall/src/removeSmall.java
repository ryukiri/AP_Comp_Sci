import java.util.*;

public class removeSmall {
    public void remove(ArrayList<Integer> x){
        
        int iOS = 0;
        int least = x.get(0);
        for(int i=0; i<x.size()-1;i++){
            int first = x.get(i); //first
            int second = x.get(i+1); //second
            
            if(first<second){
                iOS = first;
                least = x.get(iOS);
            }
        }
        
        x.remove(iOS);
    }
}
