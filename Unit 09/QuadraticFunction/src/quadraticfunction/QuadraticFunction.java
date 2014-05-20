package quadraticfunction;

import static java.lang.Math.sqrt;

public class QuadraticFunction {
    private int a;
    private int b;
    private int c;
    public QuadraticFunction(int x, int xx, int xxx){
        a=x;
        b=xx;
        c=xxx;
    }
    
    double valueAt(double x){
        // x = [ -b ± sqrt(b^2 - 4ac) ] / 2a;
        double y = (-b + Math.sqrt(b^2 - 4*a*c)) / 2*a;
        double yy = (-b - Math.sqrt(b^2 - 4*a*c)) / 2*a;
        
        return yy + y;
    }
    
    public String toString(){
        return "a";
    }
}
