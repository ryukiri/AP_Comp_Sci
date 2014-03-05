public class createWedge {
    public static int[] cW(int n){
        int l = (n*2)-1;
        int[] x = new int[l];
        
        int count = 1;
        for(int i = 0; i<n; i++){
            x[i]=count;
            count++;
        }
        
        int morecount = n;
        for(int i=n; i>0; i++){
            x[i]=morecount;
            morecount--;
        }
        
        return x;
    }
}
