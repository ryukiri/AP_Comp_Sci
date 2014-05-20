import java.io.*;
import java.util.ArrayList;

public class FunWithQueues {
    ArrayList<String> names;
    
    public FunWithQueues(){
        names = new ArrayList<String>();
    }
    
    public void addToQueue(String word){
        names.add(word);
    }
    
    public String removeFromQueue(){
        if(names.size()==0){
            //System.out.println("The queue is empty.");
            return "The queue is empty.";
        }else{
            String x = names.get(0);
            //System.out.print(x);
            names.remove(0);
            //System.out.print(x);
            return x;
        }
    }
    
    public void addVIPToQueue(String word){
        names.add(0, word);
    }
    
    public String printList(){
        String w = "";
        for(String y : names){
            w+=y;
        }
        w.trim();
        return w;
    }
}

