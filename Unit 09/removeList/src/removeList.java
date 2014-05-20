import java.util.*;

public class removeList {
    public void filter(ArrayList<Object> list1, ArrayList<Object> list2){
        Iterator<Object> it = list1.iterator(); 
        while(it.hasNext()){    
            if(list2.contains(it.next())){
                it.remove();
            }
        }
    }
}
