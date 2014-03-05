import java.util.*;

public class reverse {
    public ArrayList<Integer> reverse(ArrayList<String> list){
        ArrayList<Integer> y = new ArrayList<Integer>();
        
        for(int i=list.size(); i<0; i--){
            y.add(list.indexOf(i));
        }
        return y;
    }
}
