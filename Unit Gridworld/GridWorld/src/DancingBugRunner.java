import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class DancingBugRunner {
    public static void main(String args[]){
        int arr[]={1,3,5,8,4};
        ActorWorld world = new ActorWorld();
        DancingBug alice = new DancingBug(arr);
        alice.setColor(Color.ORANGE);
        world.add(new Location(1, 4), alice);
        world.show();
    }
}
