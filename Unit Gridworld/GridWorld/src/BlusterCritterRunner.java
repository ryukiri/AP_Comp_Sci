import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.awt.Color;


public class BlusterCritterRunner {
    public static void main(String args[]){
        ActorWorld world = new ActorWorld();
        //world.add(new Location(7, 8), new Rock());
        //world.add(new Location(3, 3), new Rock());
        //world.add(new Location(2, 8), new Rock(Color.BLUE));
        //world.add(new Location(5, 5), new Rock(Color.PINK));
        //world.add(new Location(1, 5), new Rock(Color.RED));
        //world.add(new Location(7, 2), new Rock(Color.YELLOW));
        world.add(new Location(1, 2), new Critter());
        world.add(new Location(1, 3), new Critter());
        world.add(new Location(4, 4), new Critter());
        world.add(new Location(2, 5), new Critter());
        world.add(new Location(2, 8), new Critter());
        world.add(new Location(1, 5), new Critter());
        world.add(new Location(3, 4), new Critter());
        world.add(new Location(1, 4), new Critter());
        world.add(new Location(3, 1), new Critter());
        world.add(new Location(3, 9), new Critter());
        world.add(new Location(2, 8), new Critter());
        world.add(new Location(2, 9), new Critter());
        world.add(new Location(1, 8), new Critter());
        world.add(new Location(3, 3), new Critter());
        world.add(new Location(2, 2), new BlusterCritter(2));
        world.show();
    }
}
