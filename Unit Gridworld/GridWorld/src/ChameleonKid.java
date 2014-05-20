import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import static info.gridworld.grid.Location.HALF_CIRCLE;
import java.awt.Color;
import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter {
    private static final double DARKENING_FACTOR = 0.05;
    
    @Override
    public void processActors(ArrayList<Actor> actors)
    {
        //use getLocation for each actor in arraylist, compare it to yourself using getLocation
        //use getDirection on yourself first.
        Grid<Actor> gr = getGrid(); 
        ArrayList<Actor> neighbors = new ArrayList<Actor>();
        
        int myDir = getDirection();
        Location current = getLocation();
        Location frontLoc = current.getAdjacentLocation(myDir);
        //Location backLoc2432 = current.getAdjacentLocation(Math.abs(180-getDirection()));
        Location backLoc = current.getAdjacentLocation(Math.abs(myDir - HALF_CIRCLE));
        if(gr.isValid(frontLoc)){
            if(gr.get(frontLoc) != null){
            Actor frontNeighbor = gr.get(frontLoc);
            neighbors.add(frontNeighbor);
            }
        }
        
        if(gr.isValid(backLoc)){
            if(gr.get(backLoc) != null){
            Actor backNeighbor = gr.get(backLoc);
            neighbors.add(backNeighbor);
            }
        }
        
        //Actor frontNeighbor = gr.get(frontLoc);
        //Actor backNeighbor = gr.get(backLoc);
        

        //neighbors.add(frontNeighbor);
        //neighbors.add(backNeighbor);
        
        int n = actors.size();
        int nn = neighbors.size();
        if (nn == 0){
            Color c = getColor();
            int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
            int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
            int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));
            setColor(new Color(red, green, blue));
            return;        
        }
        
        int r = (int) (Math.random() * n);  //chooses a random critter neighbor

        Actor other = actors.get(r);
        setColor(other.getColor());
    }
}