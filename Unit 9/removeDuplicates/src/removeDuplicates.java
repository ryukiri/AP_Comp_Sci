import java.util.*;

public class removeDuplicates {
    public void removeDuplicates(ArrayList<String> words){
        int l = words.size();
        
        for(int i=0; i<l; i++){
            String first = words.get(i);
            for(int ii = 0; ii<l; ii++){
                if(first.equals(words.get(ii))){
                    words.remove(ii);
                }
            }
        }
    }
}
