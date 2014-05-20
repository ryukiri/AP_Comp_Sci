public class Largest2D {
    public double largestMulti(double[][] m){
        double index = 0;
        
        for(int i=0; i< m.length; i++){
            for(int ii=0; i<m[i].length; ii++){
                if(m[i][ii]>index){
                    index = m[i][ii];
                }
            }
        }
        return index;
    }
}
