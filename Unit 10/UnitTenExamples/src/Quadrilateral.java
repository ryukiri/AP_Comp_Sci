public class Quadrilateral {
    private int side1, side2, side3, side4;
    
    public Quadrilateral(int s, int ss, int sss, int ssss){
        side1 = s;
        side2 = ss;
        side3 = sss;
        side4 = ssss;
    }
    
    public int getAngleSum(){
        return 360;
    }
    
    public int getPerimeter(){
        return side1 + side2 + side3 + side4;
    }
    
    public void printDimensions(){
        System.out.println(side1 + ", " + side2 + ", " + side3 + ", " + side4);
    }
    
    public int getSide1(){
        return side1;
    }
    
    public int getSide2(){
        return side2;
    }
    
    public int getSide3(){
        return side3;
    }
    
    public int getSide4(){
        return side4;
    }
}
