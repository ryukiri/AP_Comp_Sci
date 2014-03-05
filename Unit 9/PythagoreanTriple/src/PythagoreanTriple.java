import java.util.*;

public class PythagoreanTriple {
    private int[] pythag;
    
    public void makePythagoreanTriple(int m, int n){
        if(m < n){
            int temp = m;
            m = n;
            n=temp;
        }
        double a1 = Math.pow(m, 2) - Math.pow(n, 2);
        int a = (int)a1;
        int b = 2*m*n;
        double c1 = Math.pow(m, 2) + Math.pow(n, 2);
        int c = (int)c1;
        
        pythag = new int[3];
        pythag[0]=a;
        pythag[1]=b;
        pythag[2]=c;
    }
    
    public int getPythag(){
        for(int x : pythag){
            return x;
        }
        return 0;
    }
}
