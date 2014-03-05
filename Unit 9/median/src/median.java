import java.util.*;

public class median {
    public boolean isMedian(double[] sample, double m){
        int l = sample.length;
        
        Arrays.sort(sample);
        if(sample.length%2!=0){ //if its odd
            if(m == sample[(l-1)/2]){
                return true;
            }else
                return false;
        }else
        
        //if(sample.length%2==0){
            if(m == ( sample[l/2] + sample[(l/2)-1] ) / 2){
                return true;
            }else
                return false;
        //}
    }
}
