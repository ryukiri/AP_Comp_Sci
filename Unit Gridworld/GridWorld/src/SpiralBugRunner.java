import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class SpiralBugRunner {
    public static void main(String args[]){
        ActorWorld world = new ActorWorld();
        SpiralBug alice = new SpiralBug(3);
        alice.setColor(Color.ORANGE);
        //SpiralBug bob = new SpiralBug(2);
        world.add(new Location(4, 6), alice);
        //world.add(new Location(3, 3), bob);
        world.show();
    }
}
