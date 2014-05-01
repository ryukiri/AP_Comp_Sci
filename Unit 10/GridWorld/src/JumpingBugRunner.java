import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.awt.Color;

public class JumpingBugRunner {
    public static void main(String args[]){
        ActorWorld world = new ActorWorld();
        JumpingBug alice = new JumpingBug(Color.ORANGE);
        Rock r = new Rock();
        world.add(new Location(6,8),r);
        world.add(new Location(7, 8), alice);
        world.show();
    }
}
