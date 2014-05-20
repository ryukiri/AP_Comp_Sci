import info.gridworld.actor.Bug;

public class ZBug extends Bug {
    private int steps;
    private int diagSteps;
    private int sideLength;
    private int diagLength;
    private int counter = 0;
    
    public ZBug(int length){
        steps = 0;
        diagSteps = 0;
        sideLength = length;
        diagLength = length + 1;
        setDirection(90);
    }
    
    public void act()
    {
            if (steps < sideLength && canMove())
            {
                move();
                steps++;
                counter++;
            }
            else if(steps>=sideLength && steps<sideLength*2 && canMove())
            {
                setDirection(225);
                move();
                steps++;
                counter++;
            }else if(steps>=sideLength*2 && steps<sideLength*3 && canMove())
            {
                setDirection(90);
                move();
                steps++;
                counter++;
            }
    }
}
