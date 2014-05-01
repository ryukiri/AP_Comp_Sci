import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
    private ArrayList<Location> left = new ArrayList<Location>();
    private ArrayList<Location> right = new ArrayList<Location>();
    private ArrayList<Location> total = new ArrayList<Location>();
    private ArrayList<Location> oneStep = new ArrayList<Location>();
    
    /**
     * @return list of empty locations immediately to the right and to the left
     */
    @Override
    public ArrayList<Location> getMoveLocations(){
        ArrayList<Location> locs = new ArrayList<Location>();
        ArrayList<Location> locs2 = new ArrayList<Location>();
        Grid gr = getGrid();
        
        Location current = getLocation();
        int currentDir = getDirection();
        //stuff on right
        int rightDir = currentDir + Location.RIGHT;
        //System.out.println(rightDir);
        Location adjacent = current.getAdjacentLocation(rightDir);
        Location nextAdjacent = adjacent.getAdjacentLocation(rightDir);
        
        //stuff on left
        //int leftDir = (rightDir+180)%360;
        int leftDir = currentDir + Location.LEFT;
        //System.out.println(leftDir);
        Location adjacentLeft = current.getAdjacentLocation(leftDir);
        Location nextAdjacentLeft = adjacentLeft.getAdjacentLocation(leftDir);
        
        if(gr.isValid(adjacent) && gr.get(adjacent) == null){
            locs2.add(adjacent);
            right.add(adjacent);
            oneStep.add(adjacent);
            
            if(gr.isValid(nextAdjacent) && gr.get(nextAdjacent) == null){
                locs.add(nextAdjacent);
                right.add(nextAdjacent);
            }
        }
        if(gr.isValid(adjacentLeft) && gr.get(adjacentLeft) == null){
            locs2.add(adjacentLeft);
            left.add(adjacentLeft);
            oneStep.add(adjacentLeft);
            
            if(gr.isValid(nextAdjacentLeft) && gr.get(nextAdjacentLeft) == null){
                locs.add(nextAdjacentLeft);
                left.add(nextAdjacentLeft);
            }
        }
        if(left.size() == 2 && right.size() == 2){
            total.add(adjacent);
            total.add(nextAdjacent);
            total.add(adjacentLeft);
            total.add(nextAdjacentLeft);
        }

        
        //TEST STUFFS
        //System.out.println(locs.size());
        //for(Location x : locs){
        //    System.out.println(x);
        // }
        //System.out.println(locs2.size());
        //System.out.println(rightDir);
        
        return locs;
    }
    
    /**
     * If the crab critter doesn't move, it randomly turns left or right.
     * @param loc
     */
    /*
    @Override
    public void makeMove(Location loc)
    {
        if(getMoveLocations().size()!=2){
            if (loc.equals(getLocation())){
            double r = Math.random();
            int angle;
                if (r < 0.5)
                    angle = Location.LEFT;
                else
                    angle = Location.RIGHT;
            setDirection(getDirection() + angle);
        }
            else{
                if (loc == null)
                    removeSelfFromGrid();
                else
                    moveTo(loc);    
            }
        }else if(getMoveLocations().size()==2){
            int x = (int)(Math.random()*2);
            moveTo(getMoveLocations().get(x)); 
       }
    }
    */
    
    public void makeMove(Location loc){
        if(getMoveLocations().size() == 2){
            //if(getMoveLocations().size()==1){
            //    super.makeMove(loc);
            //}
            //System.out.println(getMoveLocations().size());
            moveTo(getMoveLocations().get((int)(Math.random()*2)));
        }else if(getMoveLocations().size() != 2 && oneStep.size() == 2){
            if (loc.equals(getLocation())){
                double r = Math.random();
                int angle;
                if (r < 0.5)
                    angle = Location.LEFT;
                else
                    angle = Location.RIGHT;
                setDirection(getDirection() + angle);
                moveTo(oneStep.get((int)Math.random()*2));
            }else{
                if (loc == null)
                    removeSelfFromGrid();
                else
                    moveTo(loc);
            }
        }else
        {
            if (loc.equals(getLocation())){
                double r = Math.random();
                int angle;
                if (r < 0.5)
                    angle = Location.LEFT;
                else
                    angle = Location.RIGHT;
                setDirection(getDirection() + angle);
                //moveTo(oneStep.get((int)Math.random()*2));
            }else{
                if (loc == null)
                    removeSelfFromGrid();
                else
                    moveTo(loc);
            }
        }
        /*
        else if(getMoveLocations().size()==1 || getMoveLocations().size() == 0){
            double r = Math.random();
            int angle;
                if (r < 0.5)
                    angle = Location.LEFT;
                else
                    angle = Location.RIGHT;
                setDirection(getDirection() + angle);
        }
           */ 
    }
}