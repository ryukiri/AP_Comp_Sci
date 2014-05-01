
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class KingCrab extends CrabCritter{
    public void processActors(ArrayList<Actor> actors)
    {
        Grid gr = getGrid();
        Location originalLocation;
        Location futureLocation;
        int dir;
        Location current = getLocation();
        //gr.getEmptyAdjacentLocations(current).size();
        
        for(Actor a : actors){
            originalLocation = a.getLocation();
            dir = getLocation().getDirectionToward(a.getLocation());
            
            for(int i = dir - Location.HALF_RIGHT; i <= dir + Location.HALF_RIGHT; i+=Location.HALF_LEFT){
                futureLocation = a.getLocation().getAdjacentLocation(i);
                if(gr.isValid(futureLocation) && getGrid().get(futureLocation) == null){
                    a.moveTo(futureLocation);
                    break;
                }
            }
            if(a.getLocation().equals(originalLocation)){
                a.removeSelfFromGrid();
            }
        }
    }
}
