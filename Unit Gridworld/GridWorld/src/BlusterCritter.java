import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

public class BlusterCritter extends Critter {
    private static final double DARKENING_FACTOR = 0.05;
    private int c;
    
    public BlusterCritter(int x){
        c = x;
    }
    
    @Override
    public void processActors(ArrayList<Actor> actors){
        Grid<Actor> gr = getGrid();
        if(gr == null)
            return;
        ArrayList<Actor> adjNei = new ArrayList<Actor>();
        
        Location current = getLocation();
        int dir = getDirection();
        Location adjacent = current.getAdjacentLocation(getDirection());
        Location nextAdjLoc = adjacent.getAdjacentLocation(getDirection());
        
        int tempL = getDirection();     //gets current direction
        Location adjacent2 = current.getAdjacentLocation(tempL);
        Location nextAdjLoc2 = adjacent2.getAdjacentLocation(tempL);     //gets location 2 steps ahead of tempL
        for(int i = 0; i<9; i++){
            if(gr.isValid(nextAdjLoc2)){
                Actor farNei = gr.get(nextAdjLoc2);     
                if(farNei != null){
                    adjNei.add(farNei);
                }
            }
        tempL = tempL + 45;
        }
        
        Color brighterColor;
        Color darkerColor;
        
        int numC = adjNei.size();
        if(numC >= c){
            darkerColor = getColor().darker();
            setColor(darkerColor);
            //darken();
        }else{
            //brighten();
            brighterColor = getColor().brighter();
            setColor(brighterColor);
        }
    }
    
    private void brighten(){
    	Color c = getColor();
        int red = (int) ((c.getRed() + 2) * (1 + DARKENING_FACTOR));
        int green = (int) ((c.getGreen() + 2) * (1 + DARKENING_FACTOR));
        int blue = (int) ((c.getBlue() + 2) * (1 + DARKENING_FACTOR));
        if(red > 255)
        	red = 255;
        if(green > 255)
        	green = 255;
        if(blue > 255)
        	blue = 255;
        setColor(new Color(red, green, blue));
    }
    
    private void darken(){
        Color c = getColor();
        int red = (int) ((c.getRed() + 2) * (1 - DARKENING_FACTOR));
        int green = (int) ((c.getGreen() + 2) * (1 - DARKENING_FACTOR));
        int blue = (int) ((c.getBlue() + 2) * (1 - DARKENING_FACTOR));
        if(red > 255)
        	red = 255;
        if(green > 255)
        	green = 255;
        if(blue > 255)
        	blue = 255;
        setColor(new Color(red, green, blue));
    }
}
