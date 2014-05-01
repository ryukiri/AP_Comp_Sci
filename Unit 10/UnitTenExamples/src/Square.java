public class Square extends Rectangle {
    private double diagonal;
    
    public Square(int s){
        super(s, s);
        diagonal = calculateDiagonal();
    }
    
    @Override
    public double calculateDiagonal(){
        return Math.sqrt(2) * getSide1();
    }

    @Override
    public void printDimensions(){
        super.printDimensions();    //uses the Rectangle print demensions
        System.out.print(getDiagonal());
    }
}
