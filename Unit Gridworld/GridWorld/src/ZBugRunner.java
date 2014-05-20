import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class ZBugRunner {
    public static void main(String args[]){
        ActorWorld world = new ActorWorld();
        ZBug alice = new ZBug(5);
        alice.setColor(Color.ORANGE);
        //ZBug bob = new ZBug(2);
        world.add(new Location(2, 3), alice);
        //world.add(new Location(3, 3), bob);
        world.show();
    }
}
