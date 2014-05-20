public class shuffle {
    public void shuffle(Object[] arr){
        int l = arr.length;
        
        for(int i=0; i<l; i++){
            int x = (int)(Math.random()*l)+1;
            arr[i]=arr[x];
        }
    }
}
