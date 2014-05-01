import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class CircleBugRunner {
    public static void main(String args[]){
        ActorWorld world = new ActorWorld();
        CircleBug alice = new CircleBug(3);
        alice.setColor(Color.ORANGE);
        CircleBug bob = new CircleBug(2);
        world.add(new Location(4, 6), alice);
        world.add(new Location(3, 3), bob);
        world.show();
    }
}
