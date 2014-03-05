import java.util.ArrayList;

public class FunWithStacks {
    ArrayList<String> x;
    
    public FunWithStacks(){
        x = new ArrayList<String>();
    }
    
    public void push(String word){
        x.add(word);
    }

    public String pop(){
        int size = x.size();
        if(x.size()==0){
            //System.out.print("The queue is empty.");
            return "The queue is empty.";
        }else{
            String y = x.get(size-1);
            x.remove(size-1);
            return y;
        }
    }
    
    public String peek(){
        int size = x.size();
        if(x.size()==0){
            //System.out.println("The queue is empty.");
            return "The queue is empty.";
        }else{
            String y = x.get(size-1);
            //System.out.print(y);
            return y;
        }
    }
}
