import java.util.*;

public class Main {
    public static void main(String args[]){
        //System.out.println("Perimeter is: " + q1.getPerimeter());
        //System.out.println(q1.getAngleSum());
        //q1.printDimensions();
        //System.out.println();
        
        //Rectangle r1 = new Rectangle(3,5);
        //r1.printDimensions();
        //System.out.println("Diagonal is: " + r1.getDiagonal());
        //System.out.println("Perimeter is: " + r1.getPerimeter());
        //System.out.println();
        
        ArrayList<Quadrilateral> quad = new ArrayList<Quadrilateral>();
        Quadrilateral q1 = new Quadrilateral(2,3,4,5);
        Quadrilateral q2 = new Rectangle(3, 5); //Okay since quadrilateral is more general than rectangle
            //More specific to generic = compiler error (EX: rectangle to quadrilateral)
        
        System.out.println("The diagonal is: " + ((Rectangle)q2).getDiagonal());
        
        Quadrilateral q3 = new Square(4);
        
        Rectangle r1 = new Rectangle(4,7);
        Square s1 = new Square(6);
        
        quad.add(q1);
        quad.add(q1);
        quad.add(q3);
        
        //System.out.println("The diagonal of r2 is: " + ((Rectangle)r2).getDiagonal()); 
            //needs to bind (similar to typecast) it to remind comp r2 is a rectangle
        //quad.add(r2);
        
        
        for(Quadrilateral q : quad){
            q.printDimensions();
        }
        
    
        //Square s1 = new Square(5);
        //System.out.println(s1.getDiagonal());
        
        
    }
}
