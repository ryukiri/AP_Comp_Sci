import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class JumpingBug extends Bug {
    public JumpingBug(Color c){
        super(c);
    }
    
    @Override
    public boolean canMove(){
        Grid<Actor> gr = getGrid();
        if(gr == null)
            return false;
        Location current = getLocation();
        Location adjacent = current.getAdjacentLocation(getDirection());
        Location nextAdjLoc = adjacent.getAdjacentLocation(getDirection());
        
        
        Actor neighbor1, neighbor2;
        if(!gr.isValid(adjacent) && !gr.isValid(nextAdjLoc)){
            //System.out.print("FALSE");
            return false;
        }
            
        if(gr.isValid(adjacent)){
            neighbor1 = gr.get(adjacent);
            return(neighbor1 == null) || (neighbor1 instanceof Flower);
        }
            
        if(gr.isValid(nextAdjLoc)){
            neighbor2 = gr.get(nextAdjLoc);
            return(neighbor2 == null) || (neighbor2 instanceof Flower);
        }
        return false;
    }
    
    @Override
    public void move(){
        Grid<Actor> gr = getGrid();
        if(gr == null)
            return;
        Location current = getLocation();
        Location adjacent = current.getAdjacentLocation(getDirection());
        Location nextAdjLoc = adjacent.getAdjacentLocation(getDirection());

        Actor neighbor1 = gr.get(adjacent);
        Actor neighbor2 = gr.get(nextAdjLoc);
        
        if (gr.isValid(nextAdjLoc) && (neighbor2 == null || neighbor2 instanceof Flower))
            moveTo(nextAdjLoc);
        else
            moveTo(adjacent);
        Flower flower = new Flower(getColor());
        flower.putSelfInGrid(gr, current);
    }
}
