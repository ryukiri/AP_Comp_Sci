public class Rectangle extends Quadrilateral {
    private double diagonal;
    
    public Rectangle(int b, int h){
        super(b, b, h, h);
        diagonal = calculateDiagonal();
    }
    
    public double calculateDiagonal(){
        return Math.sqrt(Math.pow(getSide1(), 2) + Math.pow(getSide3(), 2)); 
                //Checks this class first, since DNE, it checks parents classes. Goes up 1 by 1
        //return Math.sqrt(Math.pow(super.getSide1(), 2) + Math.pow(super.getSide3(), 2)); 
    }
    
    public double getDiagonal(){
        return diagonal;
    }
    
    public void printDimensions(){
        System.out.println(getSide1() + "x" + getSide3());
    }
}