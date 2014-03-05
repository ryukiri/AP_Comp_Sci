public class rotate {
    void rotateLeft(int[] a){
        
        for(int i=1; i<a.length; i++){
            a[i]=a[i-1];
        }
    }
    
    void rotateRight(int[] a){
        
        for(int i=0; i<a.length; i++){
            a[i]=a[i+1];
                if(i==0){
                    a[a.length]=a[0];
                }
        }
    }
}
